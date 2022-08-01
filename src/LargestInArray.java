import java.util.Arrays;

public class LargestInArray {
    /*public static void main(String args[]){
        int array[] = {10, 20, 25, 63, 96, 57};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array ::"+ Arrays.toString(array));
        int res = array[size-1];
        System.out.println("largest element is ::"+res);
    }*/


    public static void main(String args[]){
        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Third largest element is:: "+array[size-1]);
    }
}
