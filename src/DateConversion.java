/**
Given a time in

        -hour AM/PM format, convert it to military (24-hour) time.

        Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
        - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

        Example

        Return '12:01:00'.

        Return '00:01:00'.

        Function Description

        Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

        timeConversion has the following parameter(s):

        string s: a time in

        hour format

        Returns

        string: the time in

        hour format

        Input Format

        A single string
        that represents a time in -hour clock format (i.e.: or

        ).

        Constraints

        All input times are valid

        Sample Input

        07:05:45PM

        Sample Output

        19:05:45
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class DateConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        /*int s1 = Integer.valueOf(s.substring(0, 2));
        int newInt = 0;
        if(s1<12)
        {
            newInt = s1 + 12;
            // s1 = 12 + 1;
            // s1++;
        }
        else if(s1>12){
            newInt = s1 - 12;
            // s1 = 00;
            // s1++;
        }
        StringBuilder stringBuilder1 = new StringBuilder(s);
        stringBuilder1.delete(0, 2);
        String newTime = String.valueOf(newInt)+stringBuilder1.toString();
        String newString = s1+s;
        StringBuilder stringBuilder = new StringBuilder(newTime);
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        String toUse = stringBuilder.toString();
        return toUse;*/


        String[] t = s.split(":");
        int hour = Integer.parseInt(t[0]) % 12;

        if (Character.toUpperCase(s.charAt(s.length()-2)) == 'P') {
            hour += 12;
        }

        String hourStr = String.valueOf(hour);
        if (hour < 10) {
            hourStr = "0" + hourStr;
        }

        return hourStr + ":" + t[1] + ":" + t[2].substring(0,2);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = DateConversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
