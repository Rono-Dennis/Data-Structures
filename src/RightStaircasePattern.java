import java.util.Scanner;

public class RightStaircasePattern {

    public static void main(String[] args) {
        // Declare all varibales
        int noOfLines;
        // Use Scanner to accept no of lines pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of lines for pattern you want: ");
        noOfLines = sc.nextInt();
        // Display left staircase pattern
        System.out.println("Right Staircase Pattern:");
        for (int row = 0; row < noOfLines; row++) {
            for (int col = 0; col < noOfLines; col++) {
                if (row < noOfLines- col-1) {
                    /*System.out.print("row is "+row);
                    System.out.print("col is "+String.valueOf(noOfLines- col-1));*/
                }else
                    System.out.print("#");
            }
            // Display in a new line
            System.out.println();
        }
    }
}
/*
    public static void staircase(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(j<n-i-1){
                    System.out.print(" ");

                }else{
                    System.out.print("#");}
            }
            System.out.println();
        }

    }*/
