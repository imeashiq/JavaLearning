package sdet_java.task2;

import java.util.Scanner;

public class Q9 {
	//Write a Java Program to Convert Character to String and Vice-Versa
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String strValue = scanner.nextLine();
		scanner.close();
		char[] chr = stringToChar(strValue);
		charToString(chr);
	}

	/*
	 * Converts Char[] to String
	 */
	public static String charToString(char[] sequence) {
		return sequence.toString();
	}

	/*
	 * Converts String to Char[]
	 */
	public static char[] stringToChar(String sequence) {
		return sequence.toCharArray();
	}
}
