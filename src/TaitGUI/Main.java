package TaitGUI;

import java.io.File;

/**
 * Test class for the Mail Service Add your testing to this class Add a
 * Statement of Compliance
 *
 * @author Andrew Tait (1504693)
 * Date: 22/1/2016
 * Description: Main/Test Class for CM2015 - Assessment 3: GUI
 * The main GUI is setup and run from this class
 * 
 * Statement of Compliance:
 * Implementation
•	All Implementation tasks have been attempted and completed (Task1 to Task 10).
•	NetBeans IDE version 8.0.2 was used for implementation, running on Windows 10.
•	Input validation is present when necessary including error checking and handling.
•	Each task is commented and documented clearly within the GUI framework.
•	Any provided code/classes has not been altered except the main runnable class.
•	However there was an error with the loading system later on in the development when loading an incompatible file as it would display an error on the Netbeans output terminal but would not affect the GUI itself.
•	The Van details sorted functions work s but only in descending order. It also works without altering the order of any other functions.

* Testing:
* All the tasks and their corresponding functionality have been tested through a variety of test cases.
The test cases for each task have been validated and verified by normal, extreme and exceptional inputs and conditions.
Any unexpected results are documented.
Each test case includes:
•	Test Number
•	Its Purpose
•	Inputs
•	Excepted Outputs
•	Final Result

 */
public class Main
{

    public static void main(String[] args)
      {
        Fleet f = new Fleet(new Person("John", "Doe"));
        f.readFromFile(new File("post.txt"));
        System.out.println(f);
        System.out.println(f.getVan(0));
        //f.getVan(0).sortItems();
        System.out.println(f.getVan(0));
        //f.sortVans();
        System.out.println(f);
        //ft.saveToFile(new File("test.txt"));

        //GUI setup
        MainGUI MG = new MainGUI();
        MG.setVisible(true);
      }
}
