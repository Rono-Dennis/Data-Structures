import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median {

    public static double findmedian(List<Integer> numArray) {

        Collections.sort(numArray);
        System.out.print( "output is: "+numArray);
        double median = 0;
        if (numArray.size() % 2 == 0)
        median = ((double) numArray.get(numArray.size() / 2) + (double) numArray.get(numArray.size() / 2 - 1)) / 2;
        /*System.out.println("first test median: "+ numArray.get(numArray.size() / 2));
        System.out.println("second test median: "+ numArray.get(numArray.size() / 2 - 1));
        System.out.println("first median: "+ median);*/
        else
            median = (double) numArray.get(numArray.size() / 2);
        System.out.println("first median: "+ median);
        return median;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(9);
        System.out.println("output is: "+findmedian(list));
    }
}
