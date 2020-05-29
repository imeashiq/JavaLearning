package sdet_java.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
	/*
	 * Regar likes to play with Heaps a lot. One day, he had an
	 * array A holding N numbers. He was interested in subsets of size K. He made
	 * all possible subsets of size K from the array A. For each subset, he
	 * calculated sum elements and inserted the value of sum into a min−Heap.
	 * Krankit, his mischievous neighbour, popped out (M−1) elements from the
	 * min-Heap while Regar was busy having snacks. Now, Regar came after having
	 * snacks and popped out one element from the min-Heap expecting the minimum
	 * possible number but he became sad as soon as he realized that he obtained the
	 * wrong result. Help him by telling the amount which he needs to subtract to
	 * get the correct result.
	 */
	static ArrayList<String> subset = new ArrayList<String>();

	public static void subset(int[] A, int k, int start, int currLen, boolean[] used) {
		if (currLen == k) {
			String temp = "";
			for (int i = 0; i < A.length; i++) {
				if (used[i] == true) {
					temp += A[i] + ",";
				}
			}
			subset.add(temp.substring(0, temp.length() - 1));
			return;
		}
		if (start == A.length) {
			return;
		}
		used[start] = true;
		subset(A, k, start + 1, currLen + 1, used);

		used[start] = false;
		subset(A, k, start + 1, currLen, used);
	}

	public static int leastSum(int p) {
		int sum = 0;
		String arr = subset.get(p);
		String[] sumArr = arr.split(",");
		for (String s : sumArr) {
			sum += Integer.parseInt(String.valueOf(s));
		}
		return sum;
	}

	public static int heap(String num, String arr) {
		int result = 0;
		int count = Integer.parseInt(num.split("\\s")[0]);
		int[] numArr = new int[count];
		for (int i = 0; i < count; i++) {
			numArr[i] = Integer.parseInt(String.valueOf(arr.split("\\s")[i]));
		}
		int constant = Integer.parseInt(String.valueOf(num.split("\\s")[1]));
		Arrays.sort(numArr);
		boolean[] B = new boolean[numArr.length];
		subset(numArr, constant, 0, 0, B);
		int sum1 = leastSum(0);
		int m = Integer.parseInt(String.valueOf(num.split("\\s")[2]));
		result = leastSum(m - 1);
		return result - sum1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int testCase = Integer.parseInt(scanner.nextLine());
			String[] num = new String[testCase];
			String[] arr = new String[testCase];
			for (int i = 0; i < testCase; i++) {
				num[i] = scanner.nextLine();
				arr[i] = scanner.nextLine();
			}
			for (int j = 0; j < testCase; j++) {
				System.out.println(heap(num[j], arr[j]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

}
