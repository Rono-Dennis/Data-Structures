// Java program to print the sum
// of all numbers in range L and R

import java.io.*;
import java.util.Scanner;

class TestOddAdd {



    // Function to return the sum of
// all odd natural numbers
    static int sumOdd(int n)
    {
        int terms = (n + 1) / 2;
        int sum = terms * terms;
        return sum;
    }

    // Function to return the sum
// of all odd numbers in range L and R
    static int suminRange(int l, int r)
    {
        return sumOdd(r) - sumOdd(l - 1);
    }

    // Driver Code
    public static void main (String[] args) {
        int l = 1, r = 10;
        System.out.print( "Sum of odd natural numbers from L to R is "
                + suminRange(l, r));
    }
}
// This code is contributed by shs..















//Test



/*
import java.util.*;
        import java.lang.*;
        import java.io.*;
        import java.lang.Math;

public class Main {

}*/
