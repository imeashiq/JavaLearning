package sdet_java.task2;

import java.util.Scanner;

public class Q6 {
	//Write a Java Program to Remove All Whitespaces from a String 
	public static void main(String[] args) {
		String getVal;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		getVal = scanner.nextLine();
		//Remove all white spaces from the string
		getVal = getVal.replaceAll("\\s", "");
		System.out.println("After removing white spaces : " + getVal);
		scanner.close();
	}

}
