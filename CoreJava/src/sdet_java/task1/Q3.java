package sdet_java.task1;

import java.util.Scanner;
import java.util.TreeSet;

public class Q3 {
	//Given an array A of length N and a number K, find the greatest number in the array A that is smaller than K.  
	static TreeSet<Integer> set = new TreeSet<Integer>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			// No of elements
			int n = scanner.nextInt();
			// No of queries
			int q = scanner.nextInt();

			// Add all the elements to a set
			for (int i = 0; i < n; i++) {
				set.add(scanner.nextInt());
			}

			// Find the greatest lower number
			for (int j = 0; j < q; j++) {
				greatestNumber(scanner.nextInt());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	public static void greatestNumber(int value) {
		System.out.println(set.descendingSet().stream().filter(a -> a < value).findFirst().get());
	}
}
