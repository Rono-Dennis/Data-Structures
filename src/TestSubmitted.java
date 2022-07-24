import java.util.Scanner;

public class TestSubmitted {
    public static int sumOdd(int L, int R) {

        //this is default OUTPUT. You can change it.
        // int result=-404;

        //write your Logic here:
        int number = (L+1)/2;
        int result = number * number;

        int secondSum = (R+1)/2;
        int sumSecond = secondSum*secondSum;

//        int firstSum = (firstInt+1)/2;
//        int sumFirst = firstSum*firstSum;
        int sum = sumSecond - result;

        return sum;
    }
    /*static int Total(int l, int r){
        return sumOdd(r) - sumOdd(l-1);
    }*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // INPUT [uncomment & modify if required]
        System.out.println("enter 1");
        int L = sc.nextInt();
        System.out.println("enter 2");
        int R = sc.nextInt();

        // OUTPUT [uncomment & modify if required]
        System.out.println(sumOdd(L,R));
        sc.close();
    }

}


/*
    public static int sumOdd(int n) {

        //this is default OUTPUT. You can change it.
        // int result=-404;

        //write your Logic here:
        int number = (n+1)/2;
        int result = number * number;

        return result;
    }
    static int Total(int l, int r){
        return sumOdd(r) - sumOdd(l-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // INPUT [uncomment & modify if required]
        int L = sc.nextInt();
        int R = sc.nextInt();

        // OUTPUT [uncomment & modify if required]
        System.out.print(Total(L,R));
        sc.close();
    }*/
