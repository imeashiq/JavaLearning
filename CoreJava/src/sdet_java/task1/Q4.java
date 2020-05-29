package sdet_java.task1;

import java.util.Scanner;

public class Q4 {
	//Swap given two numbers and print them. (Try to do it without a temporary variable.) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Getting no of TestCases
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int varX = scanner.nextInt();
			int varY = scanner.nextInt();
			swapVar(varX, varY);
		}
		scanner.close();
	}

	public static void swapVar(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + " " + y);
	}

}
