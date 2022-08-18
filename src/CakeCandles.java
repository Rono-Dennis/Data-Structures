/*You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

        Example

        The maximum height candles are units high. There are of them, so return

        .

        Function Description

        Complete the function birthdayCakeCandles in the editor below.

        birthdayCakeCandles has the following parameter(s):

        int candles[n]: the candle heights

        Returns

        int: the number of candles that are tallest

        Input Format

        The first line contains a single integer,
        , the size of .
        The second line contains space-separated integers, where each integer describes the height of

        .

        Constraints

        Sample Input 0

        4
        3 2 1 3

        Sample Output 0*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        // Write your code here
        //System.out.println(candles.size() - 1);
        int heighest = 0;
        int  max = candles.get(0);
        for(int i=0; i<candles.size();i++){
            if((candles.get(i)> max)){
                max =candles.get(i);
            }
        }
        for(int i=0; i<candles.size();i++){
            if((candles.get(i) == max)){
                heighest++;
            }}
//        System.out.println(heighest);
        return heighest;
    }

    public static void main(String[] args) {
        List<Integer> answer = new ArrayList<>();
        answer.add(18);
        answer.add(90);
        answer.add(90);
        answer.add(13);
        answer.add(90);
        answer.add(75);
        answer.add(90);
        answer.add(8);
        answer.add(90);
        answer.add(43);

        System.out.println(birthdayCakeCandles(answer));
    }
}
