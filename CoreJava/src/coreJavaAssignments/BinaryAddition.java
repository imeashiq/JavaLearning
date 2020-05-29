package coreJavaAssignments;

import java.util.Scanner;

public class BinaryAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Get the input from the console
		System.out.println("Input first binary number : ");
		String a = scanner.nextLine();

		// Get the input from the console
		System.out.println("Input second binary number : ");
		String b = scanner.nextLine();

		scanner.close();

		// Perform Binary Addition operations
		System.out.println("Sum of two binary numbers : "
				+ Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2)));

	}

}
