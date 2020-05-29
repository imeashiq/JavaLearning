package sdet_java.task4;

import java.util.Scanner;

public class Q6 {
	/*
	 * Write a java program to check whether given number is binary or not. A binary
	 * number is a number which contains only 0 or 1. For example : 101101,
	 * 110010110, 10010011 are binary numbers
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		while (number > 10) {
			number = number / 10;
		}
		if (number % 10 == 0 || number % 10 == 1) {
			System.out.println("The given number is Binary number.");
		} else {
			System.out.println("The given number is not Binary number.");
		}
		scanner.close();
	}

}
