import java.util.Arrays;

public class sqlQuery {

    /*important sql queries*/
    /**SELECT * FROM pagination.user;
    SET SQL_SAFE_UPDATES = 0;
    UPDATE user SET status = "BANNED" WHERE (id % 2 = 0);
    UPDATE user SET status = "BANNED" WHERE (id > 40 AND id < 28);

    DELETE FROM user WHERE id > 100;

    UPDATE user SET image_url = CONCAT('https://randomuser.me/api/portraits/men/', FLOOR(RAND() * 100), '.jpg');

    SELECT FLOOR(RAND() * 100);*/



    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,7,8,10};
        int min = 0;
//        for(int i = 0; i<=arr.length;i++){
            min = Arrays.stream(arr).filter(i -> i >= 0).min().orElse(0);
//            System.out.println("min is "+ min);
//        }
        System.out.println("min is "+ min);
    }
}

