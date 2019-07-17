package com.inputoutput;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder b = new StringBuilder(s);
		String t= b.reverse().toString();
		if(t.equals(s)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
	}

}
