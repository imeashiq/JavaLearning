package coreJavaAssignments;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int temp = 0;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Get the input from the console
		System.out.println("Input an Integer : ");
		String a = scanner.nextLine();

		scanner.close();

		// Perform each digit calculation
		for (int i = 0; i < a.length(); i++)
			temp += Integer.parseInt(String.valueOf(a.charAt(i)));
		System.out.println("The sum of digits is : " + temp);
	}

}
