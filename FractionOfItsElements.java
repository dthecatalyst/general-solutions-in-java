import java.util.Scanner;

public class FractionOfItsElements {

    private static void plusMinus(int[] arr) {
        double negativeCount=0.0,positiveCount=0.0,zeroCount=0.0;
        for (int anArr : arr) {
            if (anArr < 0) {
                negativeCount++;
            } else if (anArr > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f",positiveCount/arr.length,
                negativeCount/arr.length,zeroCount/arr.length);
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}

