/*Given a square matrix, calculate the absolute difference between the sums of its diagonals. 
For example, the square matrix is shown below: 

[1 2 3]
[4 5 6]
[9 8 9]

The left-to-right diagonal = 1 + 5 + 9 = 15 . The right to left diagonal = 3 + 5 + 9 = 17 . Their absolute difference is
|15 - 17|= 2. 
*/
import java.util.Scanner;

public class DiagonalDiffMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int total1 = 0;
        int total2 = 0;

        for (int a_i = 0; a_i < n; a_i++) {//rows
            for (int a_j = 0; a_j < n; a_j++) {//iterates through the Column
                a[a_i][a_j] = in.nextInt();//initializing the matrix
            }
            total1 += a[a_i][a_i];//a00,a11,a23 adding them all
            total2 += a[a_i][n - 1 - a_i];//a02,a11,a20
        }
        System.out.println(Math.abs(total1 - total2));
    }
}
