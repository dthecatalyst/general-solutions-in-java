/*At HackerLand University, a passing grade is any grade 40 points or
higher on a 100 point scale. Sam is a professor at the university and likes to round each
student’s grade according to the following rules:

If the difference between the grade and the next higher multiple of 5 is less than 3,
round to the next higher multiple of 5
If the grade is less than 38, don’t bother as it’s still a failing grade
Automate the rounding process then round a list of grades and print the results.
* */
import java.util.Scanner;

public class RoundingGrade {
    private static int[] solve(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38 && (grades[i] / 5 + 1) * 5 - grades[i] < 3)
                grades[i] = (grades[i] / 5 + 1) * 5;
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
