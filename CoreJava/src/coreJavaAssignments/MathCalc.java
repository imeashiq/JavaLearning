package coreJavaAssignments;

import java.util.Scanner;

public class MathCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Get the input from the console
		System.out.println("Input First Number : ");
		int a = scanner.nextInt();
		System.out.println("Input Second Number : ");
		int b = scanner.nextInt();
		
		scanner.close();
		
		//Print the results
		System.out.println(a +" + "+ b + " = " + (a + b));
		System.out.println(a +" - "+ b + " = " + (a - b));
		System.out.println(a +" * "+ b + " = " + (a * b));
		System.out.println(a +" / "+ b + " = " + (a / b));
		System.out.println(a +" mod "+ b + " = " + (a % b));
	}

}
