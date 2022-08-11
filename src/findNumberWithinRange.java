/*
Given an array arr[] containing positive elements. A and B are two numbers defining a range. The task is to check if the array contains all elements in the given range.

        Example 1:

        Input: N = 7, A = 2, B = 5
        arr[] =  {1, 4, 5, 2, 7, 8, 3}
        Output: Yes
        Explanation: It has elements between
        range 2-5 i.e 2,3,4,5

        Example 2:

        Input: N = 7, A = 2, B = 6
        arr[] = {1, 4, 5, 2, 7, 8, 3}
        Output: No
        Explanation: Array does not contain 6.


        Your Task:
        This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function check_elements() that takes array arr, integer N, integer A, and integer B  as parameters and returns the boolean True if array elements contain all elements in the given range else boolean False.

        Note: If the array contains all elements in the given range then driver code outputs Yes otherwise, it outputs No

        Expected Time Complexity: O(N).
        Expected Auxiliary Space: O(1).


        Constraints:
        1 ≤ N ≤ 107


        View Bookmarked Problems
        Company Tags
        Topic Tags
        If you are facing any issue on this page. Please let us know.
*/

import java.util.Arrays;

public class findNumberWithinRange {

    static boolean check_elements(int arr[], int n, int A, int B)
    {
        boolean result = false;
        n = B-A;
        System.out.println(" n is "+n);
        Arrays.sort(arr);
        int[] nums = new int[n+3];
        for(int i = A; i < nums.length; i++){
            nums[i] = i ;
//            System.out.print(nums[i]);
            for(int z=A-1;z<n+2;z++){
                int m=arr[z];
                System.out.print(m + " ");
                if(nums[i] == arr[z])
                {
                    result = true;
                }else{
                    result = false;
                }
            }
        }System.out.println("\n");


        /*System.out.println("\n");*/



        return result;
    }

    public static void main(String[] args) {
        /*int N = 7, A = 2, B = 5;
        int arr[] =  {1, 4, 5, 2, 7, 8, 3};*/

        int N = 7, A = 2, B = 6;
        int arr[] = {1, 4, 5, 2, 7, 8, 3};


        System.out.println("Answer is: "+check_elements(arr,N,A,B));


    }
}

/* if(arr[i] == A && arr[i] == B){

         System.out.println("true");

                *//*if (arr[i] == B){
                    System.out.println("Also true");
                }*//*
         }*/
