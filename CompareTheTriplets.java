/*Alice and Bob each created one problem. A reviewer rates the two challenges, awarding points on a scale from
1 to 100 for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet a =(a[0],a[1],a[2]),and the rating for Bob's challenge to be the triplet
b = (b[0],b[1],b[2]).

For example, a=[1,2,3]
and b=[3,2,1]. For elements 0, Bob is awarded a point a[0]<b[0] because.For the equal elements a[1] and b[1],no points are earned.
Finally, for elements 2,a[2]>b[2] so Alice receives a point. Your return array would be [1,1] with Alice's score first and Bob's
second
*/


import java.lang.reflect.Array;
import java.util.*;

public class CompareTheTriplets {

    private static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int resultA = 0;
        int resultB = 0;
        int[] arrA = {a0, a1, a2};
        int[] arrB = {b0, b1, b2};

        for (int i = 0; i < 3; i++) {
            if (arrA[i] > arrB[i] && arrA[i] - arrB[i] != 0) {
                resultA++;
            } else if (arrB[i] > arrA[i] && arrB[i] - arrA[i] != 0) {
                resultB++;
            }
        }
        int[] array = {resultA, resultB};
        return array;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
