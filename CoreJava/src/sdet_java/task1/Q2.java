package sdet_java.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q2 {
	//Write a java program to reverse an array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no elements : ");
		int noOfElements = scanner.nextInt();
		Integer[] elements = new Integer[noOfElements];
		System.out.println("Enter elements :");
		for (int i = 0; i < noOfElements; i++) {
			elements[i] = scanner.nextInt();
		}
		scanner.close();
		reverseArray(elements);
	}

	public static ArrayList<Integer> reverseArray(Integer[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		Collections.reverse(list);
		return list;
	}

}
