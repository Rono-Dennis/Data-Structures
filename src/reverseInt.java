import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseInt {
    public static void main(String[] args) {

        int num = 1234, reversed = 0;

        System.out.println("Original Number: " + num);
        System.out.println("another is: "+19234%10);
        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            System.out.println("digit is: "+ digit);

            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        reverseArray(list);
    }

    public static List<Integer> reverseArray(List<Integer> a){
        Collections.reverse(a);
        return a;
    }
}
