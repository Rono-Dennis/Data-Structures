import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.min;

public class javaclass {

     public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), k = in.nextInt();
//        int[] x = new int[n];
//        for(int i = 0; i < n; i++) x[i] = in.nextInt();
//        Arrays.sort(x);
//        System.out.println(f(n, k, x));

        f(3, new int[]{7,3,10,100,300,200,1000,20,30});
        f(4, new int[]{10,4,1,2,3,4,10,20,30,40,100,200});
        f(2, new int[]{5,2,1,2,1,2,3});
        }

        private static int f(int k, int[] x){
//           System.out.println("before sort:" + x);
        Arrays.sort(x);
        int n = x.length;
//           System.out.println("after sort:" + n);
        int result = Integer.MAX_VALUE;
//           System.out.println("maximum value" + result);
        for(int i = 0; i + k-1 < n; i++){
           result = min(result, x[i+k-1]-x[i]);
//        if(x[i+k-1] - x[i] < min) min = x[i+k-1]-x[i];
        }

        return result;
        }
}