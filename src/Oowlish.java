/*
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Oowlish {


    */
/**
     * A container of integers that should support
     * elements addition, removal, and search of the median element
     *//*

    public class ContainerImpl implements Container {
        ArrayList<Integer> arr;
        HashMap<Integer, Integer> hash;
        // List<Integer> values = new ArrayList<>();
        public ContainerImpl() {
            arr = new ArrayList<Integer>();
            hash = new HashMap<Integer, Integer>();
            // write your code here
        }

        @Override
        public void add(int value) {
            int s = arr.size();
            arr.add(value);

            hash.put(value, s);
            // newInt.add(value);
            // write your code here

        }

        @Override
        public boolean delete(int value) {


            // Check if element is present
            Integer index = hash.get(value);
            if (index == null){
                return false;
            }
            else{

                // If present, then remove element from hash
                hash.remove(value);
                //  return true;

                // Swap element with last element so that remove from
                // arr[] can be done in O(1) time
                int size = arr.size();
                Integer last = arr.get(size-1);
                Collections.swap(arr, index,  size-1);

                // Remove last element (This is O(1))
                arr.remove(size-1);
                //  return true;

                // Update hash table for new index of last element
                hash.put(last, index);
                return true;
            }
            //  return false;



            // if(newInt.equals(value)){
            //   newInt.remove(value);
            //   return true;
            // }else{
            //   return false;
            // }
            // write your code here

            // throw new UnsupportedOperationException();
        }

        @Override
        public int getMedian() {
            Collections.sort(arr);
            int result = 0;
            if(arr.size() % 2 == 1){
                result = arr.get((arr.size() + 1) / 2 - 1);
                return result;
            }else if(arr.size() % 2 == 0){
                result = arr.get(arr.size() / 2 - 1);
                return result;
            }

            return result;
            // write your code here

            // throw new UnsupportedOperationException();
        }
    }

}
*/
