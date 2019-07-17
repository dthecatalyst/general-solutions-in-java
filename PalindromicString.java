package CodeWars;


import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        if (s.equals(s2.toString())) {
            System.out.print("String is Palindromic");
        } else {
            System.out.println("Not Palindromic");
        }

    }
}








