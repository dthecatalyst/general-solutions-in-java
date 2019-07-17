package javaio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDigits {

	public static void main(String args[]) throws Exception {

		System.out.println("Enter the numerical string\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] counts = new int[10];
		String line = br.readLine();
		if (line.length() > 100) {
			return;
		}

		// initialize array
		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}

		for (int i = 0; i < line.length(); i++) {
			int digit = Character.getNumericValue(line.charAt(i));
			counts[digit]++;
		}

		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + " " + counts[i]);
		}

	}
}