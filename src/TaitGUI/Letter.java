
package TaitGUI;

/**
 * Class to store information about a Letter
 * @author garry
 */
public class Letter extends MailItem{
    private boolean firstClass;

    public Letter(Addressee addressee, boolean firstClass) {
        super(addressee);
        this.firstClass = firstClass;
    }

    public boolean isFirstClass() {
        return firstClass;
    }

    public void setFirstClass(boolean firstClass) {
        this.firstClass = firstClass;
    }
    
    // add calculateCost - (Task 3)
    public double calculateCost(){
        if (this.isFirstClass())
            return 0.63;
        else 
            return 0.54;
    }

    // Add the cost to the toString() - Task 4
    @Override
    public String toString() {
        String str = "";
        if (this.isFirstClass())
            str = "First Class Letter\n";
        else 
            str = "Second Class Letter\n";
        return str + super.toString() + "Cost: £" + this.calculateCost();
    }
    
    
}
