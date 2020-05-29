package sdet_java.task3;

import java.util.Scanner;

public class Q7 {
	// Write a Java Program to find the frequency of odd & even numbers in the given
	// matrix 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd = 0, even = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the matrix dimensions : ");
		// Get the matrix dimensions
		int row = scanner.nextInt();
		int column = scanner.nextInt();

		int[][] matrix = new int[row][column];

		// Enter the matrix values
		System.out.println("Enter the matrix values : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		scanner.close();

		// Calculate the frequency of odd and even numbers
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrix[i][j] % 2 == 0)
					even += 1;
				else
					odd += 1;
			}
		}
		System.out.println("The frequency of Odd number is : " + odd);
		System.out.println("The frequency of Even number is : " + even);
	}

}
