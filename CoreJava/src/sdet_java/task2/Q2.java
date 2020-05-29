package sdet_java.task2;

import java.util.Scanner;

public class Q2 {
	//Write a Java Program to Multiply to Matrix Using Multi-dimensional Arrays 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dimension of the matrix : ");
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		int[][] matrixA = new int[row][column];
		int[][] matrixB = new int[row][column];
		int[][] matrixC = new int[row][column];

		System.out.println("Enter matrix A : ");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				matrixA[i][j] = scanner.nextInt();

		System.out.println("Enter matrix B : ");
		for (int i = 0; i < row; i++)
			for (int j = 0; j < column; j++)
				matrixB[i][j] = scanner.nextInt();
		
		System.out.println("Multiplcation of two matrix : ");
		try {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					matrixC[i][j] = 0;
					for (int k = 0; k < row; k++) {
						matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
					} // end of k loop
					System.out.print(matrixC[i][j] + " "); // printing matrix element
				} // end of j loop
				System.out.println();// new line
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The Given matrix cannot be multiplied.");
		}
		scanner.close();
	}

}
