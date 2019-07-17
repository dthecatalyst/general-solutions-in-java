package array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner ar = new Scanner(System.in);
        System.out.println("number of element\n");
        int num = ar.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = ar.nextInt();
        }
        System.out.println("Reverse array");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
