/*Consider an Array a of size N
Iterate from 1 to N
In Lth iteration select the Lth minimum and swap it with a[L].
You are given an array a, size of the array N and an integer x. 
Follow the above algorithm and print the state of the array after x iterations have been performed.
*/
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int iteration = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        selectionSort(arr, iteration,size);
    }

    private static void selectionSort(int[] a, int n,int size) {
        int minimum;
        for (int itr = 0; itr < n; itr++) {
            minimum = itr;
            for (int j = itr + 1; j < size; j++) {
                if (a[j] < a[minimum]) {
                    minimum = j;
                    
                }
            }
            int temp = a[minimum];
            a[minimum] = a[itr];
            a[itr] = temp;

        }
        for (int itr : a)
            System.out.print(itr + " ");
        System.out.println();

    }


}
