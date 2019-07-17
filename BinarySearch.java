/*You have been given an array A consisting of N integers. All the elements in
this array A are unique. You have to answer some queries based on the elements
of this array. Each query will consist of a single integer x. You need to print
the rank based position of this element in this array considering that the array
is 1 indexed. The rank based position of an element in an array is its position in
the array when the array has been sorted in ascending order.

Note: It is guaranteed that all the elements in this array are unique and for each
 x belonging to a query, value x shall exist in the array.

The first line consists of a single integer N denoting the size of array A.
The next line contains N unique integers, denoting the content of array A.
The next line contains a single integer q denoting the number of queries.
Each of the next q lines contains a single integer x denoting the element whose
rank based position needs to be printed
* */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();

        }
        int Q = in.nextInt();
        int[] q = new int[Q];
        Arrays.sort(arr);
        for (int i = 0; i < Q; i++) {
            q[i] = in.nextInt();
            int result = binarySearch(arr,q[i] ,0, n - 1);
            System.out.println(result + 1);
        }

    }

    private static int binarySearch(int[] a, int key, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
