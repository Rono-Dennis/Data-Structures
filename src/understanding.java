import java.util.Scanner;

public class understanding {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scan.nextInt();
        System.out.println("You Entered:"+ n);
        System.out.println((n-65)%26+65);
    }
}
