public class Sumofsubarray {
    public static void main(String[] args) {
        int [] number = {-2,1,-3,4,-1,2,1,-5,4};
//        int [] number = {2,-34,-4,55,-6,73,-22};
       int currentSum = number[0], newsum = number[0];

        if (number.length<1){
            System.out.println("no array");
        }
        for (int i =0; i<number.length; i++){
//            for(int j =i+ 1; j<i; ++j){
            newsum = Math.max(number[i], newsum + number[i]);
                 currentSum = Math.max(currentSum, newsum);


//            }
        }
        System.out.println(currentSum);
    }
}
