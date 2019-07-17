import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        bubbleSort(arr, size);

    }

    private static void bubbleSort(int[] a, int n) {
        int count = 0;
        int temp;
        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < n - k - 1; i++) {
                if (a[i] > a[i + 1]) {
                    count++;
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                }
            }
        }
        System.out.println(count);
    }
}

