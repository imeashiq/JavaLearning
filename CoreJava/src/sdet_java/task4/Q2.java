package sdet_java.task4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2 {
	// Write a Java program to find second largest number in an integer array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int arrSize = scanner.nextInt();
		Integer[] array = new Integer[arrSize];
		System.out.println("Enter the array elements : ");
		for (int i = 0; i < arrSize; i++)
			array[i] = scanner.nextInt();
		scanner.close();
		List<Integer> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println("Second largest number in array is : " + list.get(list.size() - 2));
	}

}
