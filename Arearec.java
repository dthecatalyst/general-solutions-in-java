package array;

import java.util.Scanner;

public class Arearec {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int length = in.nextInt();
        int width = in.nextInt();
        System.out.println(rectangleArea(length, width));
        System.out.println(rectanglePerimeter(length, width));
    }

    private static int rectangleArea(int someLength, int someWidth) {
        return someLength * someWidth;
    }

    private static int rectanglePerimeter(int someLength, int someWidth) {

        return 2 * (someLength + someWidth);
    }
}
