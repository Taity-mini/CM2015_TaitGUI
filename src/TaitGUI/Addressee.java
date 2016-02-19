
package TaitGUI;

/**
 * Class to store information about the addressee for a mail item
 * @author garry 
 * @version August 2015
 */
public class Addressee {
    private final Person name;
    private final String address;
    private final String postCode;

    public Addressee(Person name, String address, String postCode) {
        this.name = name;
        this.address = address;
        this.postCode = postCode;
    }

    public Person getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

     public String getPostCode() {
        return postCode;
    }

    @Override
    public String toString() {
        return this.getName().toString() +", " + this.getAddress() + ", " + 
               this.getPostCode() + "\n";
    }
    
    
}
