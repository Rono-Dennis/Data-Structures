import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

        Example
        The minimum sum is and the maximum sum is

        . The function prints

        16 24

        Function Description

        Complete the miniMaxSum function in the editor below.

        miniMaxSum has the following parameter(s):

        arr: an array of

        integers

        Print

        Print two space-separated integers on one line: the minimum sum and the maximum sum of
        of

        elements.

        Input Format

        A single line of five space-separated integers.

        Constraints

        Output Format

        Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

        Sample Input

        1 2 3 4 5

        Sample Output

        10 14

        Explanation

        The numbers are
        , , , , and

        . Calculate the following sums using four of the five integers:

        Sum everything except

        , the sum is
        .
        Sum everything except
        , the sum is
        .
        Sum everything except
        , the sum is
        .
        Sum everything except
        , the sum is
        .
        Sum everything except
        , the sum is

        .

        Hints: Beware of integer overflow! Use 64-bit Integer.

        Need help to get started? Try the Solve Me First problem*/
public class MinMaxSum {


    public static boolean miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int size1 = arr.get(0);
        arr.remove(0);
        //System.out.println(arr);

        // Write your code here
        int sum=0;
        for(int i=0;i<arr.size();i++){
            //System.out.println(arr.get(i));
            sum += arr.get(i);

        }
        //System.out.println(sum);

        arr.add(0,size1);
        arr.remove(arr.size() - 1);
        int sum2= 0;
        for(int j=0;j<arr.size();j++){
            //System.out.println(arr.get(i));
            sum2 += arr.get(j);

        }

        // List<Integer> newArr = new ArrayList();
        // newArr.add(sum2);
        // newArr.add(sum);

        System.out.print(sum2);
        System.out.print(" ");
        System.out.print(sum);

        return false;
    }

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        System.out.println(miniMaxSum(values));
    }
}
