import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeRoundOff
{


    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> results = new ArrayList<>();

        int grade=0;
        for(int a0 = 0; a0 < grades.size(); a0++){
            grade = grades.get(a0);
            if (grade >= 38) {
                if (grade % 5 >= 3) {
                    grade += 5 - (grade % 5);
                }
            }
            results.add(grade);
            // System.out.println(grade);
        }
        return results;
    }

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        result.add(4);
        result.add(73);
        result.add(67);
        result.add(38);
        result.add(33);
        System.out.println(gradingStudents(result));
        /*System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            if (grade >= 38) {
                if (grade % 5 >= 3) {
                    grade += 5 - (grade % 5);
                }
            }
            System.out.println(grade);
        }*/
    }
}
