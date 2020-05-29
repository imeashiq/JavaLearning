package sdet_java.task3;

import java.util.Scanner;

public class Q1 {
	//Write a Java Program to determine whether a given matrix is an identity matrix 
	public static void main(String[] args) {
		boolean flag = true;
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
			// Determine the given matrix is Identity matrix
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					if (i == j && matrix[i][j] == 1)
						continue;
					else if (i != j && matrix[i][j] == 0)
						continue;
					else {
						flag = false;
						break;
					}
				}
			}
			if (flag)
				System.out.println("The given matrix is Identity Matrix");
		} else
			System.out.println("The given matrix is not Identity Matrix");
	}
}
