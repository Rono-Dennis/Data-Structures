public class Multiplier {

    private static boolean checkMultiplier(int[] arr)
    {
//        int z = arr[],x
        for(int i=0; i< arr.length; i++){
             int y = arr[i];
             if (y%6 == 0)

            System.out.println("output is: "+y);
        }


        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,6,8,12,36,7,5,9,42};
        System.out.println(checkMultiplier(a));

    }
}
