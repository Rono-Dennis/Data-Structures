import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public Solution(String aaabbbc) {
    }
//    public static void main (String args[]){
//
//        Solution solution = new Solution();
//
//    }
//    public boolean isValid(String s) {
//        // Start typing your Java solution below
//        // DO NOT write main() function
//        if(s==null||s.length()==0) return true;
//        Stack stack=new Stack();
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') stack.push(s.charAt(i));
//            else if((s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')&&!stack.empty()){
//                char cur=stack.peek().toString().charAt(0);
//                if((cur=='('&&s.charAt(i)==')')||(cur=='{'&&s.charAt(i)=='}')||(cur=='['&&s.charAt(i)==']')) stack.pop();
//                else return false;
//            }else return false;
//        }
//        return stack.empty();
//    }







//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int n = in.nextInt(), k = in.nextInt();
//            int[] x = new int[n];
//            for(int i = 0; i < n; i++) x[i] = in.nextInt();
//            Arrays.sort(x);
//            System.out.println("array numbers" + f(n, k, x));
//            System.out.println("length is:"+ n);
//            System.out.println("array numbers"+x);
//            System.out.println("group number length"+ k);

//            f(3, new int[]{7,3,10,100,300,200,1000,20,30});
//            f(4, new int[]{10,4,1,2,3,4,10,20,30,40,100,200});
//            f(2, new int[]{5,2,1,2,1,2,3});
//
//        }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(), k = in.nextInt();
//        int[] x = new int[n];
//        for(int i = 0; i < n; i++) x[i] = in.nextInt();
//        Arrays.sort(x);
//        System.out.println(f(k, x));
//        System.out.println(k);
            f(3, new int[]{7,3,10,100,300,200,1000,20,30});
            f(4, new int[]{10,4,1,2,3,4,10,20,30,40,100,200});
            f(2, new int[]{5,2,1,2,1,2,3});
    }

        private static int f(int k, int[] x){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i + k-1 < x.length; i++){
                if(x[i+k-1] - x[i] < min)
                    System.out.println(x[i]);
                    min = x[i+k-1]-x[i];
//                System.out.println(min);
            }
            return min;
        }



}
