/*
Chief's bot is playing an old DOS based game. There is a row of buildings of different heights arranged at each index along a number line. The bot starts at building and at a height of

        . You must determine the minimum energy his bot needs at the start so that he can jump to the top of each building without his energy going below zero.

        Units of height relate directly to units of energy. The bot's energy level is calculated as follows:

        If the bot's

        is less than the height of the building, his If the bot's is greater than the height of the building, his

        Example

        Starting with

        , we get the following table:

        botEnergy   height  delta
        4               2       +2
        6               3       +3
        9               4       +5
        14              3       +11
        25              2       +23
        48

        That allows the bot to complete the course, but may not be the minimum starting value. The minimum starting
        in this case is

        .

        Function Description

        Complete the chiefHopper function in the editor below.

        chiefHopper has the following parameter(s):

        int arr[n]: building heights

        Returns

        int: the minimum starting

        Input Format

        The first line contains an integer

        , the number of buildings.

        The next line contains
        space-separated integers

        , the heights of the buildings.

        Constraints

        where

        Sample Input 0

        5
        3 4 3 2 4

        Sample Output 0

        4

        Explanation 0

        If initial energy is 4, after step 1 energy is 5, after step 2 it's 6, after step 3 it's 9 and after step 4 it's 16, finally at step 5 it's 28.
        If initial energy were 3 or less, the bot could not complete the course.

        Sample Input 1

        3
        4 4 4

        Sample Output 1

        4

        Explanation 1

        In the second test case if bot has energy 4, it's energy is changed by (4 - 4 = 0) at every step and remains 4.

        Sample Input 2

        3
        1 6 4

        Sample Output 2

        3

        Explanation 2

        botEnergy   height  delta
        3           1       +2
        5           6       -1
        4           4       0
        4

        We can try lower values to assure that they won't work.*/


import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ChiefHopper {
    public static int chiefHopper(List<Integer> arr) {
        // Write your code here
        if(arr.size() < 1)
            return 0;
        int energy = 0;
        for(int i = 0; i < arr.size(); i++) {
            int tmp = energy + arr.get(arr.size()-1-i);
            int one = (tmp % 2);
            energy = tmp / 2 + one;
        }
        return energy;
    }

    public static void main(String[] args) {
        List<Integer> intNum = new ArrayList<>();
        intNum.add(3);
        intNum.add(4);
        intNum.add(3);
        intNum.add(2);
        intNum.add(4);

        System.out.println(chiefHopper(intNum));
    }
}

/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.chiefHopper(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}*/
