public class ChechDuplicates {
    public static void main(String[] args) {
            int [] nums = {1,2,3,4,5,6,6,4};
            int max = 0;
            if(nums.length<=1)
            {
//                return max;
                System.out.println(max);
            }
            int[] dp = new int[nums.length];

            for(int i=1; i<nums.length; i++){
                for( int j=0; j<i; j++){
                    if(nums[j] < nums[i]){
                        dp[i] = Math.max(dp[i], dp[j]+1);
                    }
                }
                max = Math.max(max, dp[i]);
            }
        System.out.println(max);
//            return max;
        }
    }



