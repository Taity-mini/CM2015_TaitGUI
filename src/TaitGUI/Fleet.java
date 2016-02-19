
package TaitGUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class to store details of a fleet of vans
 * @author student
 * Class to be added by student (Task 6)
 */
public class Fleet {
       
    // fields to be added (Task 6)
    private Person manager;
    private Van[] vans;
    private int numberOfVans;

    // Constructor to be added (Task 6)
    public Fleet(Person manager) {
        this.manager = manager;
        this.vans = new Van[20];
        this.numberOfVans = 0;      
    }

    // getter, setters and toString() - Task 7
    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }

    public int getNumberOfVans() {
        return numberOfVans;
    }
    
    public Van getVan(int number) {
        return vans[number];
    }

    public void addVan(Van van) {
        this.vans[this.numberOfVans] = van;
        this.numberOfVans++;
    }

    @Override
    public String toString() {
        String str = "Fleet manager: " + this.manager.toString() + "\n";
        for(int i = 0; i < this.numberOfVans; i++) {
            str += vans[i].toString();
        }
        return str;
    }
    
    // Add  read from file method (Task 10)    
    public void readFromFile(File f){
        try {
            Scanner s = new Scanner(f);
            s.useDelimiter(",|\n");
            Person newManager = new Person(s.next(),s.next());
            this.setManager(newManager);
            int numVans = s.nextInt();
            // For each van
            for (int i = 0; i < numVans; i++){
                // Read the driver
                Person newDriver = new Person(s.next(),s.next());
                // numbers of items
                int numItems = s.nextInt();    
                ArrayList<MailItem> newMail = new ArrayList();
                // read each item
                for (int j = 0; j < numItems; j++){
                    char type = s.next().charAt(0);                        
                    Addressee a = new Addressee(new Person(s.next(),s.next()), 
                            s.next(), s.next());
                    if (type == 'L'){
                        Letter l = new Letter(a, s.nextBoolean());
                        newMail.add(l);
                    } else if (type == 'P'){
                        Parcel p = new Parcel(a, s.nextInt());
                        newMail.add(p);
                    } else if (type == 'E'){
                        ExpressParcel e = new ExpressParcel(a, s.nextInt());
                        newMail.add(e);        
                    } else {
                        return;
                    }
                }
               // add van
               this.addVan(new Van(newMail, newDriver));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fleet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void saveToFile(File f) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(this.getManager().getFirstName() + ","
                    + this.getManager().getSecondName());
            bw.newLine();
            bw.write("" + this.getNumberOfVans());
            bw.newLine();
            for (int i = 0; i < this.getNumberOfVans(); i++) {
                Van v = this.getVan(i);
                bw.write(v.getDriver().getFirstName() + ","
                        + v.getDriver().getSecondName() + ","
                        + v.getItems().size());
                bw.newLine();
                for (MailItem m : v.getItems()) {
                    String address = m.getAddressee().getName().getFirstName()
                            + "," + m.getAddressee().getName().getSecondName()
                            + "," + m.getAddressee().getAddress()
                            + "," + m.getAddressee().getPostCode() + ",";
                    if (m instanceof Letter) {
                        bw.write("L," + address + ((Letter) m).isFirstClass());
                    } else if (m instanceof ExpressParcel) {
                        bw.write("E," + address + ((ExpressParcel) m).getWeight());
                    } else {
                        bw.write("P," + address + ((Parcel) m).getWeight());
                    }
                    bw.newLine();
                }
            }
            bw.flush();
            bw.close();
        } catch (Exception ex) {
            Logger.getLogger(Fleet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // To be added - Task 12
    public void sortVans() {
        Arrays.sort(vans, 0, numberOfVans, new VanComparator());
    }
}
