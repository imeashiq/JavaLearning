package sdet_java.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
	/*
	 * Write a java program to separate zeros from non-zeros in the given array. You
	 * have to move zeros either to end of the array or bring them to beginning of
	 * the array. For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, then
	 * moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0} and
	 * bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int arrSize = scanner.nextInt();
		Integer[] array = new Integer[arrSize];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arrSize; i++)
			array[i] = scanner.nextInt();
		scanner.close();
		// Get zero to the start of array
		int pos = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] != 0) {
				array[pos] = array[i];
				pos--;
			}
		}
		while (pos >= 0) {
			array[pos] = 0;
			pos--;
		}
		System.out.println("The resultant array : " + Arrays.toString(array));
	}

}
