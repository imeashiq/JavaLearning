package coreJavaAssignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Get the input from the console
		System.out.print("Input a String : ");
		String a = scanner.nextLine();

		scanner.close();

		System.out.print("Reverse String : ");

		// Reverse the given string
		for (int i = a.length() - 1; i >= 0; i--)
			System.out.print(a.charAt(i));
	}

}
