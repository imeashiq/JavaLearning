package sdet_java.task3;

import java.util.Scanner;

public class Q4 {
	//Write a Java Program to determine whether two matrices are equal 
	public static void main(String[] args) {
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the matrix dimensions : ");
		// Get the matrix dimensions
		int row = scanner.nextInt();
		int column = scanner.nextInt();

		int[][] matrixA = new int[row][column];
		int[][] matrixB = new int[row][column];

		// Enter the matrix values
		System.out.println("Enter the matrix A values : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrixA[i][j] = scanner.nextInt();
			}
		}
		// Enter the matrix values
		System.out.println("Enter the matrix B values : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrixB[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		// Determine the given matrixes are equal
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrixA[i][j] != matrixB[i][j]) {
					flag = false;
					break;
				}
			}
		}
		if (flag)
			System.out.println("The given matrix are equal");
		else
			System.out.println("The given matrix are not equal");
	}
}
