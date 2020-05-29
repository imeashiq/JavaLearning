package sdet_java.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q8 {
	//Write a Java Program to Concatenate Two Arrays 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Get First Array
		System.out.println("Enter the size of first array : ");
		int size = scanner.nextInt();
		String[] arr1 = new String[size];
		for (int i = 0; i < size; i++)
			arr1[i] = scanner.next();

		// Get Second array
		System.out.println("Enter the size of second array : ");
		size = scanner.nextInt();
		String[] arr2 = new String[size];
		for (int i = 0; i < size; i++)
			arr2[i] = scanner.next();

		scanner.close();

		// Combine Array
		System.out.println("Array after merging : " + combineArray(arr1, arr2));
	}

	public static List<String> combineArray(String[] arr1, String[] arr2) {
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		return list;
	}

}
