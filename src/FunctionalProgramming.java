import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    public static void main(String[] args) {
//        printAllNumbersFunctional(List.of(12,4,14,5,4,5,6,65,2,43));
        List<String> cources=  List.of("Spring","API","MICROSERVICES", "Spring boot","PCP","AZURE","Docker","kubernetes");
//        printCourses(cources);
        List<String> fruits = List.of("apple","banana","bean","mango");
//        printFruits(fruits);



        Predicate<? super String> startsWithA = s -> s.startsWith("A");
        /*List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> filteredNames = names.stream()
                .filter(startsWithA)
                .collect(Collectors.toList());
        System.out.println("predicate "+filteredNames);*/

        /*List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames.stream().findFirst().get());*/
    }

    private static void printFruits(List<String> fruits) {
        Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
        Optional<String> first = fruits.stream().filter(predicate).findAny();
        System.out.println(first);
        System.out.println(first.isEmpty());
        System.out.println(first.isPresent());
        System.out.println(first.get());
    }

    private static void printAllNumbersFunctional(List<Integer> integers) {
//        integers.forEach(FunctionalProgramming::print);
        integers.stream()
//                .filter(FunctionalProgramming::print)
                .filter(integer -> integer%2!=0)
                .map(number-> number* number)
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
//        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
//        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);

        /**forEach loop list all courses*/
//        courses.forEach(FunctionalProgramming::courses);

        /**for loop list all courses*/
        /*for (String course: courses){
            if (course.contains("e"))
               System.out.println(course);
        }*/

        /**for loop at least 4 letters*/
        for (String course: courses){
            if (course.toCharArray().length>=4)
                System.out.println(course);
        }

        /*for (String course: courses){
            if (course.length()>=4)
                System.out.println(course);
        }*/

        /**functional programming*/
//        courses.stream().filter(course -> course.length()>=4).forEach(System.out::println);

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
