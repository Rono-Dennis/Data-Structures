

// Java implementation of the above approach
import java.io.*;

    class checknumberPalindrome{

        // Function to check palindrome
        static boolean checkPalindrome(String str)
        {

            // Calculating string length
            int len = str.length();

            // Traversing through the string
            // upto half its length
            for(int i = 0; i < len / 2; i++)
            {

                // Comparing i th character
                // from starting and len-i
                // th character from end
                if (str.charAt(i) !=
                        str.charAt(len - i - 1))
                    return false;
            }

            // If the above loop doesn't return then
            // it is palindrome
            return true;
        }

        // Driver Code
        public static void main(String[] args)
        {

            // Taking number as string
            String st = "112233445566778899000000998877665544332211";

            if (checkPalindrome(st) == true)
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }

class GFG {
    public static void main(String[] args)
    {
        int input1 = 7007;
        String str_input1 = String.valueOf(input1); //conversion of int to string
        String str = new StringBuilder(str_input1).reverse().toString(); // reversing the input string

        if (str.equals(str_input1)) //Checking for Palindrome
        {
            System.out.println(input1 + " is Palindrome");
        }
        else
        {
            System.out.println(input1+ " is not Palindrome");
        }
    }
}