package TaitGUI;

import java.util.Comparator;

/**
 * Class to be added by student to compare vans by number of items (Task 11)
 * @author student
 */
public class VanComparator implements Comparator<Van>{

    public int compare(Van o1, Van o2) {
        return o2.getItems().size() - o1.getItems().size();
    }
    
}
