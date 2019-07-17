import java.util.*;


public class SomeOfArray {


    private static int simpleArraySum(int[] ar) {
        int total = 0;
        for (int i : ar)
            total += i;
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(ar);
        System.out.println(result);
    }
}


