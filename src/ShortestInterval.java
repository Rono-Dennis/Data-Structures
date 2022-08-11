import java.util.Arrays;

public class ShortestInterval {

    static int findSmallestInterval(int [] numbers)
    {
        // Number of items in the array
        int length = numbers.length;

        // Sort array in ascending order
        Arrays.sort(numbers);

        // Initialize difference with the max integer allowed by Java in the constant
        // Usually int(2147483647) in 32 bit systems and int(9223372036854775807) in 64 bit systems
        int diff = Integer.MAX_VALUE;

        // Find the smallest interval comparing the adjacent pairs in the sorted array
        System.out.println("out"+(length-1));
        for (int i = 0; i < length-1; i++){
            System.out.println("data is "+numbers[i + 1]);
            if (numbers[i + 1] - numbers[i] < diff){
                diff = numbers[i + 1] - numbers[i];
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        int Arr[] = {1,20,76,11,5,66,24};

        System.out.println(findSmallestInterval(Arr));
    }
}
