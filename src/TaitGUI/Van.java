
package TaitGUI;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class to store details of a Van.
 * @author Garry
 */
public class Van {
    private ArrayList<MailItem> items;
    // driver should be added of type Person (Task 1)
    private Person driver;

    // Constructor adapted to assign the driver attribute (Task 1)
    public Van(ArrayList<MailItem> items, Person driver) {
        this.items = items;
        this.driver = driver;
    }
   
    // getter method added (Task 1)
    public Person getDriver() {
        return driver;
    }

    public ArrayList<MailItem> getItems() {
        return items;
    }

    // to String() method should be added (Task 2)
    @Override
    public String toString() {
        String str = "*******\nDriver: " + this.driver.toString() + "\n";
        for (MailItem m: this.items){
            str += m.toString() + "\n";
        }
        return str; 
    }
 
    // sortItems method to be added (Task 9)
    public void sortItems(){
        Collections.sort(items);
    }
    
}
