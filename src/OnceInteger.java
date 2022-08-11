public class OnceInteger {

    // Java program to find the array
// element that appears only once

        // Return the maximum Sum of difference
        // between consecutive elements.
        static int findSingle(int ar[], int ar_size)
        {
            // Do XOR of all elements and return
            int res = ar[0];
            for (int i = 1; i < ar_size; i++)
                res = res ^ ar[i];

            return res;
        }

        // Driver code
        public static void main (String[] args)
        {
            int arr[] ={4,5,6,7,4,2,5,6,2};
            int ar[] = {2, 3, 5, 4, 5, 3, 4};
            int n = arr.length;
            System.out.println("Element occurring once is " +
                    findSingle(arr, n) + " ");
        }
    }

