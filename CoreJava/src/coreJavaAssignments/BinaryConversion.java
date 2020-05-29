package coreJavaAssignments;

import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Get the input from the console
		System.out.println("Input a number : ");
		int a = scanner.nextInt();

		scanner.close();

		// Convert int to binary
		System.out.println("Binary number is : " + Integer.toBinaryString(a));
	}

}
