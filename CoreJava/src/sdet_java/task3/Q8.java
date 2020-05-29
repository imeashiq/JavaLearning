package sdet_java.task3;

import java.util.Scanner;

public class Q8 {
	// Write a Java Program to find the transpose of a given matrix 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dimension of the matrix : ");
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		int[][] defaultMatrix = new int[row][column];
		int[][] transposeMatrix = new int[column][row];
		System.out.println("Enter the matrix elements : ");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				defaultMatrix[i][j] = scanner.nextInt();
		// Transpose the matrix
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				transposeMatrix[j][i] = defaultMatrix[i][j];
		// Print the transpose matrix
		System.out.println("Transpose Matrix : ");
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(transposeMatrix[i][j] + " ");
			}
			System.out.println("");
		}
		scanner.close();
	}

}
