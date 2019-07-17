import java.util.Scanner;

public class IncreasingDecreasing {

    boolean isIncreasing(int n) {
        String num = Integer.toString(n);
        char ch;
        int no = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            ch = num.charAt(i);

            if (ch > num.charAt(i + 1)) {
                no = 1;
                break;
            }

        }
        if (no == 1) {
            return false;
        } else
            return true;
    }

    boolean isDecreasing(int n) {
        String num = Integer.toString(n);
        char ch;
        int no = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            ch = num.charAt(i);

            if (ch < num.charAt(i + 1)) {
                no = 1;
                break;
            }

        }
        if (no == 1) {
            return false;
        } else
            return true;
    }

    void isBouncy(int n) {
        if (isIncreasing(n) == true)
            System.out.println("In Not B");
        else if (isDecreasing(n) == true)
            System.out.println("De not Bee");

        else System.out.println("Bouncy");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IncreasingDecreasing o = new IncreasingDecreasing();
        int n = in.nextInt();
        o.isBouncy(n);
    }
}