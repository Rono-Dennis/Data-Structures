// Java program to print all the permutations
// of the given string
public class Permutations {

    // Function to print all the permutations of str
    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "cat";

        printPermutn(s, "");
    }
}

   class HelloWorld {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,4};

        for (int i=0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}




class checkCharacters {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int [] ar = {8,7,6,5,4,3,2,1};

        if (arr.length == ar.length){
            System.out.println("size = "+ arr.length);
            String newInt = Integer.toString(arr.length);
            String newInteger = Integer.toString(ar.length);
            for (int i=0; i< arr.length; i++){
            for(int j = 0; j<ar.length; j++){
//                char c = newInt.charAt(i);
                char z = newInteger.charAt(arr[i]);
                char c = newInt.charAt(ar[j]);

//                z=c;

                System.out.println("output is"+z);
                System.out.println("output is"+c);
//                ar[j] = arr[i];
//                System.out.println(arr[i]+""+ar[j]);
            }}
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
//        for (int i=0; i< arr.length; i++){
//            for(int j = 0; j<ar.length; j++){
//                if(arr[i] == arr[j]){
//
////                    System.out.println("equal");
//                }else {
//
////                    System.out.println(" not equal");
//
//                }
//            }
//        }





        /**
         from itertools import product

         # Define the games
         games = ["Game 1", "Game 2", "Game 3", "Game 4", "Game 5", "Game 6", "Game 7", "Game 8"]

         # Define the possible outcomes for each game
         outcomes = ["1", "X", "2"]

         # Generate all permutations of the outcomes for the 8 games
         perms = list(product(outcomes, repeat=17))

         # Print the total number of permutations
         print(f"Total permutations: {len(perms)}")

         # Print all the permutations
         for perm in perms:
         for i, outcome in enumerate(perm):
         print(f"{games[i]}: {outcome}")
         print()*/



    }
}