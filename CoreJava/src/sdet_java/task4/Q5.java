package sdet_java.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
	/*
	 * Write a java program to find continuous sub array of the given array whose
	 * sum is equal to a given number. For example, If {12, 5, 31, 9, 21, 8} is the
	 * given array and 45 is the given number, then you have to find continuous sub
	 * array in this array such that whose elements add up to 45. In this case, {5,
	 * 31, 9} is such sub array whose elements add up to 45
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
		System.out.print("The continious sun-array is : ");
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i; j < arr.length; j++) {
				temp = temp + arr[j];
				if (temp == sum) {
					System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
				}
			}
		}
	}

}
