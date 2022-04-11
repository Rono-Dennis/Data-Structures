// Java program to Find the Largest Alphabetic
// Character present in the string of both
// uppercase and lowercase English characters

import java.text.SimpleDateFormat;
import java.util.Date;

class DateConversion {

    public static void main(String[] args) {
        Date dt = new Date();
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("Time in 12 hr format = "+dateFormat.format(dt));


        Date date = new Date();
        SimpleDateFormat twelveDateFormat;
        twelveDateFormat = new SimpleDateFormat("kk:mm:ss");
        System.out.println("Time in 24 hr format = "+twelveDateFormat.format(date));

        if (dateFormat.format(dt) == "12:01:00 PM"){

            twelveDateFormat.format(date);
            return;
        }
        if (dateFormat.format(dt) == "12:01:00 AM")
        {
            twelveDateFormat.format(date);
            return;
        }

    }
}

