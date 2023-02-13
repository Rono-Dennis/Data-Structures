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

/**
    Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.

 select * from (select distinc city, length(city) from station order by length(city) asc, city asc) where rownum =1
 union
 select * from (select distinc city, length(city) from station order by length(city) desc, city asc) where rownum =1

 */


/**
 *
 * Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from
 *
 *
 *SELECT DISTINCT CITY FROM STATION WHERE REGEXP_LIKE(LOWER(CITY), '^[aeiou]') and  REGEXP_LIKE(LOWER(CITY), '[aeiou]$');
 *SELECT DISTINCT CITY FROM STATION WHERE REGEXP_LIKE(LOWER(CITY), '^[aeiou]');
 *
 *
 *
 *
 * Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.
 *SELECT DISTINCT CITY FROM STATION WHERE upper(SUBSTR(CITY,1,1)) NOT IN ('A','E','I','O','U') AND lower(SUBSTR(CITY,1,1)) NOT IN
 * ('a','e','i','o','u');
 *
 *
 * Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.
 *SELECT DISTINCT CITY FROM STATION WHERE UPPER(SUBSTR(CITY, LENGTH(CITY), 1)) NOT IN ('A','E','I','O','U') AND LOWER(SUBSTR(CITY, LENGTH(CITY),1)) NOT IN ('a','e','i','o','u');
 *
 *
 *  */


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

