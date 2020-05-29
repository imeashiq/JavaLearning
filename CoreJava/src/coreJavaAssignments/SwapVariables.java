package coreJavaAssignments;

import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args) {
		int temp;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Get the input from the console
		System.out.println("Input first number : ");
		int a = scanner.nextInt();

		// Get the input from the console
		System.out.println("Input second number : ");
		int b = scanner.nextInt();

		scanner.close();
		
		//Numbers before swapping
		System.out.println("Numbers before swapping");
		System.out.println(a);
		System.out.println(b);
		
		//Swapping logic
		temp = a;
		a = b;
		b = temp;
		
		//Print numbers after swapping
		System.out.println("Numbers after swapping");
		System.out.println(a);
		System.out.println(b);
	}

}
