/*
You are given an array A of N positive integer values. A subarray of this array is called Odd-Even subarray 
if the number of odd integers in this subarray is equal to the number  of even integers in this subarray.

Find the number of Odd-Even subarrays for the given array.

Input Format:
The input consists of two lines.

First line denotes N - size of array.
Second line contains N space separated positive integers denoting the elements of array A.

Output Format:
Print a single integer, denoting the number of Odd-Even subarrays for the given array.*/


import java.util.Scanner;

public class OddEvenSubArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int idx = 0; idx < size; idx++) {
            array[idx] = in.nextInt();
        }
        int result = oddEvenSubArrays(array, size);
        System.out.println(result);
    }

    private static int oddEvenSubArrays(int[] a, int size) {
        int odd = 0,even=0,count=0,evensub=0,oddsub=0;
        
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else
                odd++;
        }
        if (odd == even) {
            for (int i = 0; i < size; i++) {
                for (int j = i; j < size; j++) {
                    for (int k = i; k <= j; k++) {
                        if (a[k] % 2 == 0) {
                            evensub++;
                        } else {
                            oddsub++;
                        }
                        if (evensub == oddsub) {
                            count++;
                        }


                    }
                }
            }


        }
        return count;
    }
}
