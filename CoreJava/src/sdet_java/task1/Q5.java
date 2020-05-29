package sdet_java.task1;

import java.util.Scanner;

public class Q5 {
	//Given a positive  N. The task is to check if N is a power of 2. That is N is 2x for some x
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of testCases : ");
		int noOfCases = scanner.nextInt();
		System.out.println("Enter number one by one : ");
		for (int i = 0; i < noOfCases; i++) {
			if (isPowerOfTwo(scanner.nextInt()))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		scanner.close();
	}

	public static boolean isPowerOfTwo(int x) {

		if (x == 0)
			return false;
		else {
			while (x != 1) {
				if (x % 2 != 0)
					return false;
				else
					x = x / 2;
			}
			return true;
		}
	}

}
