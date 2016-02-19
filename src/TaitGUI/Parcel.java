
package TaitGUI;

/**
 * Class to store information about a Parcel
 * @author garry
 */
public class Parcel extends MailItem{
    private int weight;

    public Parcel(Addressee addressee, int weight) {
        super(addressee);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Create calculateCost - (Task 3)
    public double calculateCost(){
        return 2.75 + 0.1*(this.getWeight()/100);
    }
    
    // Add the cost to the toString() (Task 4)
    @Override
    public String toString() {
        return "Parcel\n" + super.toString() + "Cost: £" + this.calculateCost();
    }
}
