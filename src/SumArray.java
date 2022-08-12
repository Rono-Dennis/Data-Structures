import java.util.ArrayList;
import java.util.List;

public class SumArray {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int size = ar.size();
        int size2 = size-1;
        System.out.println("size is: "+ size);
        System.out.println("size is: "+ size2);
        int sum = 0;
        for(int i=0; i<=size-1;i++){
            sum += ar.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(10);
        number.add(11);
        System.out.println(simpleArraySum(number));
    }
}
