import java.util.Scanner;

public class DivisibleSumPairs {
    private static int divisibleSumPairs(int n, int k, int[] ar) {
        int divisibleSumPairs = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (i < j && (ar[i] + ar[j]) % k == 0) {
                    divisibleSumPairs++;
                }
            }
        }

        return divisibleSumPairs;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
