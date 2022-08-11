/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.

        For example, the square matrix

        is shown below:

        1 2 3
        4 5 6
        9 8 9

        The left-to-right diagonal =
        . The right to left diagonal = . Their absolute difference is

        .

        Function description

        Complete the

        function in the editor below.

        diagonalDifference takes the following parameter:

        int arr[n][m]: an array of integers

        Return

        int: the absolute diagonal difference

        Input Format

        The first line contains a single integer,
        , the number of rows and columns in the square matrix .
        Each of the next lines describes a row, , and consists of space-separated integers

        .

        Constraints

        Output Format

        Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

        Sample Input

        3
        11 2 4
        4 5 6
        10 8 -12

        Sample Output

        15

        Explanation

        The primary diagonal is:

        11
        5
        -12

        Sum across the primary diagonal: 11 + 5 - 12 = 4

        The secondary diagonal is:

        4
        5
        10

        Sum across the secondary diagonal: 4 + 5 + 10 = 19
        Difference: |4 - 19| = 15

        Note: |x| is the absolute value of x*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixDiagonalDifference {

    public static int diagonalDifference(int[][] arr,int n) {
        // Write your code here
        int d1 = 0, d2 = 0;
//        int n = arr.length;
        int ds=0;
        for (int i = 0; i < n; i++)
        {
            ds = arr[i][i];
            d1 += arr[i][i];
            d2 += arr[i][n-i-1];
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);
    }

    public static void main(String[] args) {
        int n = 3;

        int arr[][] =
                {
                        {11, 2, 4},
                        {4 , 5, 6},
                        {10, 8, -12}
                };

//        List<Integer> newList = new ArrayList<Integer>(Arrays.asList({{1,2,3}}));
//
        System.out.print(diagonalDifference(arr, n));

        /*List*/
        /**public static int diagonalDifference(List<List<Integer>> arr) {
            // Write your code here
            int d1 = 0, d2 = 0;
            int n = arr.size();

            for (int i = 0; i < n; i++)
            {
                d1 += arr.get(i).get(i);
                d2 += arr.get(i).get(n-i-1);
            }
            // Absolute difference of the sums
            // across the diagonals
            return Math.abs(d1 - d2);
        }**/

        //Another List
        /**int size = arr.size();
        int sum1 = 0, sum2 = 0;
        for (int i = 0, j = size - 1; i < size; ++i, --j) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(j);
        }
        return Math.abs(sum1-sum2);*/

    }
}

