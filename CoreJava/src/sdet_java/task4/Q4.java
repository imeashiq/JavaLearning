package sdet_java.task4;

import java.util.Scanner;

public class Q4 {
	/*
	 * Write a java program to find all pairs of elements in the given array whose
	 * sum is equal to a given number. For example, if {4, 5, 7, 11, 9, 13, 8,
	 * 12} is an array and 20 is the given number, then you have to find all pairs
	 * of elements in this array whose sum must be 20. In this example, (9, 11), (7,
	 * 13) and (8, 12) are such pairs whose sum is 20 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of array elements : ");
		int arraySize = scanner.nextInt();
		int[] arr = new int[arraySize];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arraySize; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the sum value : ");
		int sum = scanner.nextInt();
		scanner.close();
		findSubset(arr, sum);
	}

	static void findSubset(int arr[], int sum) {
		System.out.print("The subset are : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum)
					System.out.print("{" + arr[i] + "," + arr[j] + "}");
			}
		}
	}

}
