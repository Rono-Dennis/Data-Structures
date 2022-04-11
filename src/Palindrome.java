public class Palindrome {

    private static boolean checkPalindrome(int[] arr){

        int temp = 0;
        int y = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int x = arr[i];
            y =i;
            System.out.println("array is:" +x);
            System.out.println("i is :" + y);
//            System.out.println("last index"+ arr[i-1]);
            System.out.println("second last index :" + (i-1));

//            if (arr[i-1]%2 == 0)
//            {
//                System.out.println("it is even");
////                temp = y/2;
////                for (int z = temp; z<arr.length; i++)
////                {
////                    int v = arr[i];
////                    System.out.println("array sec is: "+ v);
////                    System.out.println("z is "+ z);
////
////                }
//
//            }else
//            {
//                System.out.println("not even");
//            }


        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(checkPalindrome(a));
    }
}
