import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Dates {

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("2022-12-12 11:34");
        str.add("2022-12-12 10:30");
        str.add("2022-12-12 11:34");
        str.add("2022-12-12 11:36");
        str.add("2022-12-12 11:37");

        for (int i = 0; i< str.size();i++){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            List<LocalDateTime> dateTime = Collections.singletonList(LocalDateTime.parse(str.get(i), formatter).minusMinutes(2));//
//            System.out.println(dateTime);

            dateTime.forEach(H->{
                long mills = H.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
                long timeNow = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

                /*System.out.println("time now: "+ timeNow);
                System.out.println("placed time: "+mills);*/

                if (timeNow< mills){
                    System.out.println("schedule");

                    long sendNotification= mills -
                            LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

                    Timer timer = new Timer();
                    TimerTask timerTask = new TimerTask() {
                        @Override
                        public void run() {
                            System.out.println("sending Reminder:)");
//                            sendmail();
                        }
                    };
                    timer.schedule(timerTask, sendNotification);

                }else {
                    System.out.println("do not schedule");
                }
            });

        }

          }


}
