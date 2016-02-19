
package TaitGUI;

/**
 * Class to store details of a Person - first and second name
 * @author garry
 */
public class Person {
    
    private final String firstName;
    private final String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }   
    
}
