package coreJavaAssignments;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Get the input from the console
		System.out.println("Input a number : ");
		int a = scanner.nextInt();

		scanner.close();
		
		//Print Multiplication Table using Loop
		for (int i = 1; i <= 10; i++)
			System.out.println(a + " * " + i + " = " + (a * i));
	}

}
