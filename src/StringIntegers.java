
// Java program to Demonstrate asList() method
// of Arrays class for a string value

// Importing utility classes
import java.util.*;

// Main class
public class StringIntegers {

    // Main driver method
    public static void main(String[] argv) throws Exception
    {

        // Try block to check for exceptions
        try {

            // Creating Arrays of String type
            String a[]
                    = new String[] { "A","20", "1","5","21","2","B","10","56","4", "C","11", "0","D","3" };

            // Getting the list view of Array
            List<String> list = Arrays.asList(a);
            //Collections.sort(list);
            Arrays.sort(a);

            // Printing all the elements in list object
            System.out.println("The list is: " + list);
            System.out.println("The list is: " + Arrays.toString(a));
        }

        // Catch block to handle exceptions
        catch (NullPointerException e) {

            // Print statement
            System.out.println("Exception thrown : " + e);
        }
    }
}
