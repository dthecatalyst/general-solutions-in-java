package javaio;

import java.util.Scanner;

public class AbsoluteDiff {
	private static Scanner in;

	public static void main(String[] args) {

		int N, M, result;
		System.out.println("Enter the two number\n");
		in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		result = N - M;
		if (result < 0) {
			result = result * (-1);

		}
		System.out.println("Absolute diff: " + result);
	}
}
