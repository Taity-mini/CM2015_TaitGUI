
package TaitGUI;

/**
 * An abstract class to store information about a generic mail item
 * @author garry
 */
public abstract class MailItem implements Comparable<MailItem>{
    private Addressee addressee;

    public MailItem(Addressee addressee) {
        this.addressee = addressee;
    }

    public Addressee getAddressee() {
        return addressee;
    }

    public void setAddressee(Addressee addressee) {
        this.addressee = addressee;
    }
        
    // add abstract method calculateCost() (Task 3)
    public abstract double calculateCost();

    @Override
    public String toString() {
        return this.addressee.toString();
    }

    // Add compareTo() method - Task 8
    @Override
    public int compareTo(MailItem o) {
        if (this.calculateCost() < o.calculateCost()){
            return -1;
        } else if (this.calculateCost() > o.calculateCost()){
            return +1;
        } else {
            return 0;
        }
    }

    
}
