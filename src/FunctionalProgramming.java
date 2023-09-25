import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    public static void main(String[] args) {
//        printAllNumbersFunctional(List.of(12,4,14,5,4,5,6,65,2,43));
        List<String> cources=  List.of("Spring","API","MICROSERVICES", "Spring boot","PCP","AZURE","Docker","kubernetes");
        printCourses(cources);
  }
    private static void printAllNumbersFunctional(List<Integer> integers) {
//        integers.forEach(FunctionalProgramming::print);
        integers.stream()
//                .filter(FunctionalProgramming::print)
                .filter(integer -> integer%2!=0)
//                .filter(integer -> integer%2==0)
                .forEach(System.out::println);
    }
    public static boolean print(int number){
//        System.out.println(number);
//        return number%2==0;
        return number%2!=0;
    }

    private static void printCourses(List<String> courses){
        /**Stream*/
        courses.stream().filter(course -> course.contains("Spring"));
        courses.forEach(System.out::println);

        /**forEach loop list all courses*/
//        courses.forEach(FunctionalProgramming::courses);

        /**for loop list all courses*/
        /*for (String course: courses){
            if (course.contains("e"))
               System.out.println(course);
        }*/

        /**for at least 4 letters*/
        /*for (String course: courses){
            if (course.toCharArray().length<=4)
                System.out.println(course);
        }*/

        /**Iterator loop*/
        /*Iterator<String> stringIterator = courses.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }*/
    }

    public static void courses(String courses){
        System.out.println(courses);
    }

}
