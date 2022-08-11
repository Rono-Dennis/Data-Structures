import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoneInteger {
    /*public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int value = 0;
        if(a.size()<2){
            value = 1;
        }*/
        /*if(a.size() >= 1 || a.size()<100){
            for(int i=0; i<a.size();i++){
//                System.out.print(a.get(i));
                for(int j=i+1;j<a.size();j++){
                    System.out.print(a.get(j));
                    if(!Objects.equals(a.get(i), a.get(j))){

                        value = a.get(i);
                    }
                }
            }
        }*/

        static int findSingle(int ar[], int ar_size)
        {

            // Do XOR of all elements and return
            int res = ar[0];
            for (int i = 1; i < ar_size; i++)
                res = res ^ ar[i];

            return res;
        }

//    }

    public static void main(String[] args) {
            int arr[] ={4,5,6,7,4,2,5,6,2};
            int size = arr.length;
        System.out.println("output is: "+ findSingle(arr,size));
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
//        System.out.println("\noutput is: "+lonelyinteger(list));


        /*//Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {
                System.out.print(arr[j]);
                if(arr[i] == arr[j]){}
                    //System.out.println(arr[j]);
            }
        }*/
    }
}


