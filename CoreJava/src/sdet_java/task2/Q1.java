package sdet_java.task2;

import java.util.Scanner;

public class Q1 {
	//Write a Java Program to Add Two Matrix Using Multi-dimensional Arrays 
	static int row;
	static int column;
	static int[][] resultMatrix;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Get the dimension of the matrix
		System.out.println("Enter the dimension of the Matrix : ");
		row = scanner.nextInt();
		column = scanner.nextInt();
		int[][] matrixA = new int[row][column];
		int[][] matrixB = new int[row][column];

		// Get the elements for MatrixA
		System.out.println("Enter the first matrix elements : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrixA[i][j] = scanner.nextInt();
			}
		}
		// Get the elements for MatrixB
		System.out.println("Enter the second matrix elements : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrixB[i][j] = scanner.nextInt();
			}
		}
		scanner.close();

		// Call Matrix Addition Method
		additionMatrix(matrixA, matrixB);

		// Print the result matrix
		System.out.println("Result matrix after addition : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static int[][] additionMatrix(int[][] matrixA, int[][] matrixB) {
		resultMatrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		return resultMatrix;
	}
}
