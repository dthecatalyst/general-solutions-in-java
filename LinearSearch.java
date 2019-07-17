import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int key = in.nextInt();
        int[] arr = new int[size];
        for (int arr_i = 0; arr_i < size; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int result = linearSearch(arr, key);
        System.out.println(result);
    }


    private static int linearSearch(int[] a, int key) {
        for (int i = a.length-1; i > 0; i--) {
            if (key==a[i]) {
                return i+1;
            }
        }
        return -1;
    }


}


