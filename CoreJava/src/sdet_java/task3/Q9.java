package sdet_java.task3;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scanner.next();
		scanner.close();
		String temp = "";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String x = lrs(str.substring(i, n), str.substring(j, n));
				if (x.length() > temp.length())
					temp = x;
			}
		}
		System.out.println("Longest repeating sequence is : " + temp);
	}

	public static String lrs(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				return s.substring(0, i);
			}
		}
		return s.substring(0, n);
	}

}
