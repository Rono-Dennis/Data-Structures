import java.util.Scanner;

public class SumoddInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Enter the first number : ");
        int firstInt = scanner.nextInt();
        System.out.print(
                "Enter the second number : ");
        int secondInt = scanner.nextInt();

        int secondSum = (secondInt+1)/2;
        int sumSecond = secondSum*secondSum;

        int firstSum = (firstInt+1)/2;
        int sumFirst = firstSum*firstSum;

        int Total = sumSecond-sumFirst;

        System.out.println(Total);
    }
}
