/*Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
It's time to test your knowledge of Static initialization blocks.
You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram 
with breadth B and height H. You should read the variables from the standard input.
If B<= 0 or H <=0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes
*/
package com.inputoutput;

import java.util.Scanner;

public class StaticIniBlock {
	static boolean flag = true;
	static int B, H;
	static {
	    Scanner scanner = new Scanner(System.in);
	    B = scanner.nextInt();
	    scanner.nextLine();
	    H = scanner.nextInt();
	    scanner.close();
	    if (B <= 0 || H <=0){
	        flag = false;
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	    
	}

	public static void main(String[] args) {
		if(flag) {
			int area = B*H;
			System.out.println(area);
		}

	}

}
