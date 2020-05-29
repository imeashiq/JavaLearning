package sdet_java.task3;

import java.util.Scanner;

public class Q5 {
	//Write a Java Program to display the lower triangular matrix 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		if (row == column) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					if(j>i)
					matrix[i][j] = 0;
				}
			}
		}else {
			System.out.println("The matrix should be square matrix.");
		}
		
		System.out.println("Lower triangular matrix : ");
		//Print the matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
