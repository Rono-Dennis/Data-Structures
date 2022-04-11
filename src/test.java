
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//task question
//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with
//
//        places after the decimal.
//
//        Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to
//
//        are acceptable.
//
//        Example
//        There are elements, two positive, two negative and one zero. Their ratios are , and
//
//        . Results are printed as:
//
//        0.400000
//        0.400000
//        0.200000
//
//        Function Description
//
//        Complete the plusMinus function in the editor below.
//
//        plusMinus has the following parameter(s):
//
//        int arr[n]: an array of integers
//
//        Print
//        Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with
//
//        digits after the decimal. The function should not return a value.
//
//        Input Format
//
//        The first line contains an integer,
//        , the size of the array.
//        The second line contains space-separated integers that describe
//
//        .
//
//        Constraints
//
//
//        Output Format
//
//        Print the following
//        lines, each to
//
//        decimals:
//
//        proportion of positive values
//        proportion of negative values
//        proportion of zeros

public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos = 0;
        int zero = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x > 0) {
                pos++;
            } else if (x == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        System.out.println("pos output"+pos / (double) n);
        System.out.println("neq output"+neg / (double) n);
        System.out.println("zero output"+zero / (double) n);
    }
}