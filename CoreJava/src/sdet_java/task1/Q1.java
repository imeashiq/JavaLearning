package sdet_java.task1;

import java.util.Scanner;

public class Q1 {
	//Write a java program to reverse a string 
	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer();
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input String");
		buffer.append(scanner.next());
		scanner.close();
		System.out.println("Reverse of given string is : " + buffer.reverse());
	}

}
