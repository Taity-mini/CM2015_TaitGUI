
package TaitGUI;

/**
 * Class to store information about an Express Parcel
 * @author student
 * Class to be added by student (Task 5)
 */
public class ExpressParcel extends Parcel{

    public ExpressParcel(Addressee addressee, int weight) {
        super(addressee, weight);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 5.0;
    }

    @Override
    public String toString() {
        return "Express " + super.toString();
    }

}
