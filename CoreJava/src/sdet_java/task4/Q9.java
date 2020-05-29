package sdet_java.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
	/*
	 * If ‘n‘ is the positive number and ‘a‘ is an array of integers of length n-1
	 * containing elements from 1 to n. Then find the missing number in ‘a’ in the
	 * range from 1 to n. Occurrence of each element is only once. If n = 8, then
	 * array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4,
	 * 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case). You have
	 * to find out that missing number. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int arrSize = scanner.nextInt();
		Integer[] array = new Integer[arrSize];
		System.out.println("Enter the n-1 array elements : ");
		for (int i = 0; i < arrSize - 1; i++)
			array[i] = scanner.nextInt();
		scanner.close();
		ArrayList<Integer> initial = new ArrayList<Integer>(Arrays.asList(array));
		ArrayList<Integer> actual = new ArrayList<Integer>();
		for (int i = 1; i <= arrSize; i++)
			actual.add(i);
		actual.removeAll(initial);

		// Print the missing number
		System.out.println("The missing number in array is : " + actual.get(0));
	}

}
