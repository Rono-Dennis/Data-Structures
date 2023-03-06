import java.util.*;

public class LeftRotate {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        // int size = arr.size()-1;
        Collections.rotate(arr,d);

        return arr;
    }

    public static void main(String[] args) {
        /*List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);

        System.out.println("===: "+newList.size());
        int d = newList.size()-4;
        System.out.println(rotateLeft(d,newList));

        *//**Other example with scanner.in*//*
        int size, numberRotation;

        // create an empty array list
        List<Integer> numberList = new ArrayList<>();

        // create an instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the list: ");
        size = sc.nextInt();

        for(int i = 0; i < size; i++) {
            System.out.println("Enter "+(i+1)+" element in the list: ");
            numberList.add(sc.nextInt());
        }

        // print list before performing right Rotation
        System.out.println("List Before Performing Rotation : " + Arrays.toString(numberList.toArray()));

        System.out.println("How many right rotation you need to perform: ");
        numberRotation = sc.nextInt();

        // close scanner class instance
        sc.close();

        // Loop according to the number of rotations
        for (int i = 0; i < numberRotation; i++) {

            // store last element of the list in a temp variable
            int temp = numberList.get(size-1);

            // perform iteration and shift element to the right
            for (int j = size-1; j > 0; j--) {
                numberList.set(j, numberList.get(j - 1));
            }
            numberList.set(0, temp);
        }
        *//**END*/

        /**Other example with array*/

        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        //n determine the number of times an array should be rotated
        int n = 3;
        int f = arr.length-1;

        //Displays original array
        System.out.println("Original array: ");
        System.out.println("length-1 is: "+ f);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Rotate the given array by n times toward left
        for(int i = 0; i < n; i++){
            int j, first;
            //Stores the first element of the array
            first = arr[0];
            int size = arr.length-1;
            System.out.println("length is: "+size);

            for(j = 0; j < size; j++){
                //Shift element of array by one
                System.out.println("before: "+ arr[j]);
                System.out.println("before sec "+ arr[j+1]);
                arr[j] = arr[j+1];
                System.out.println("in: "+ arr[j]);
                System.out.println("in sec "+ arr[j+1]);

            }
            //First element of array will be added to the end
            arr[j] = first;
            System.out.println("after: "+ arr[j]);
            System.out.println("after sec "+ first);
        }

        System.out.println();

        //Displays resulting array after rotation
        System.out.println("Array after left rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        /**End*/

        /**List*/

        /*List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        int y = 3;

        for(int k = 0; k < y; k++){
            int z, first;
            first = newList.get(0);
            int size = newList.size()-1;
            System.out.println("size is: "+size);

            for(z = 0; z < size; z++){
                //Shift element of array by one
                newList.set(newList.get(z),newList.get(z));
//                arr[z] = arr[z+1];
            }
            //First element of array will be added to the end
//            arr[z] = first;
            newList.set(newList.get(z)-1,first);
    }
        System.out.println("After rotation");
        for (Integer integer : newList) {
            System.out.print(integer + " ");
        }*/

    }
}
