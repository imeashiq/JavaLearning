package sdet_java.task3;

import java.util.Scanner;

public class Q2 {
	//Write a Java Program to find the sum of each row and each column of a matrix 
	public static void main(String[] args) {
		int sumRow = 0;
		int sumColumn = 0;
		int k, l;
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

		for (k = 0; k < row; k++) {
			for (l = 0; l < column; l++) {
				sumRow += matrix[k][l];
				sumColumn += matrix[l][k];
			}
			System.out.println("The sum of " + (k + 1) + " row is : " + sumRow);
			System.out.println("The sum of " + (k + 1) + " coloumn is : " + sumColumn);
			sumRow = 0;
			sumColumn = 0;
		}
	}

}
