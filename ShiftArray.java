package array;

import java.util.*;

public class ShiftArray {

    private static int[] arrayLeftRotation(int[] a, int k) {
        int[] res = new int[a.length];
        int newIndex = k % a.length;
        for (int i = 0; i < a.length; i++) {
            res[i] = a[(newIndex + i) % a.length];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output ;
        output = arrayLeftRotation(a,  k);
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}

