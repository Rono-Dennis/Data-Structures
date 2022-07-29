/*
public class Pollution {
}
*/

        /*There are N number of integers in an area which produce pollution gas and filters are to be installed at each factory to reduce pollution .
        each filter installed could half the pollution factory. each factory can have multiple filters.
        There is list of N integers representing level of pullution ineach N factories in the area.
        Find minimum number of filters needed to half overall pollution*/

//Solution in Java
import java.util.Collections;
import java.util.PriorityQueue;

public class PolutionFilter {

    public static void main(String[] args) {
// TODO Auto-generated method stub

        int[] array = {5, 19, 8, 1};
        int[] array2 = {3,5,6,1, 18};//10,10
        int[] array3 = {3,5,1};//3,0,5

        PolutionFilter obj = new PolutionFilter();

        System.out.println(obj.solution(array));
        System.out.println(obj.solution(array2));
        System.out.println(obj.solution(array3));

    }

    public int solution(int[] A) {

        int totalPollution = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int a : A) {
            pQueue.add(a);
            totalPollution = totalPollution + a;
        }

        double minimunPolutionLevel = (double) totalPollution / 2;

        int numberOfFilters = 0;

        while (totalPollution > minimunPolutionLevel) {

            double filteredValue = (double) pQueue.poll() / 2;
            totalPollution = (int) (totalPollution - filteredValue);
            numberOfFilters++;
            pQueue.add((int) filteredValue);

        }
        return numberOfFilters;
    }
}