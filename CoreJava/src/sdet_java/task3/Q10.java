package sdet_java.task3;

import java.util.Scanner;

public class Q10 {
	/*
	 * Micro's math teacher just taught him about Modular Arithmetic, and gave him
	 * an assignment to solve. Assignment is really large and will take a lot of his
	 * time. Micro wants to go out and play as soon as possible. The assignment
	 * consists of some decimal numbers and Micro has to find out the value of their
	 * modulo 10^9+7. Help Micro complete this assignment.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number of testCases : ");
			int testCase = scanner.nextInt();
			double[] dec = new double[testCase];
			System.out.println("Enter the decimal values : ");
			for (int i = 0; i < testCase; i++) {
				dec[i] = scanner.nextDouble();
			}
			for (int j = 0; j < testCase; j++) {
				System.out.println("The output of the given decimal " + dec[j] + " is : ");
				System.out.println(solution(dec[j]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	private static long solution(double num) {
		long result = -1;
		int M = 1000000007;
		long mmi_10 = findMMI(10, M);
		int digitsBeforeDecimal = 0;
		String decToString = String.valueOf(num);
		char[] decimalArray = String.valueOf(num).toCharArray();
		int[] intArray = new int[decToString.length()];
		int totalDigits = 0;
		for (int i = 0; i < decToString.length(); i++) {

			char c = decimalArray[i];
			if (c == '.') {
				digitsBeforeDecimal = i;
				continue;
			}
			intArray[totalDigits++] = c - '0';
		}
		int actualDigits = totalDigits;
		for (int i = totalDigits - 1; i >= 0; i--) {
			if (intArray[i] == 0) {
				actualDigits--;
			}
			if (intArray[i] > 0) {
				break;
			}
		}
		int numberBeforeDecimal = 0;
		int prod = 1;
		for (int i = digitsBeforeDecimal - 1; i >= 0; i--) {
			numberBeforeDecimal += intArray[i] * prod;
			prod *= 10;
		}
		result = numberBeforeDecimal % M;
		int count = 0;
		for (int i = digitsBeforeDecimal; i < actualDigits; i++) {
			int multiplier = count;
			long prodResult = 0;
			prodResult += moduloMultiplication(mmi_10, intArray[i], M);
			while (--multiplier >= 0) {
				prodResult = moduloMultiplication(prodResult, mmi_10, M);
			}
			count++;
			result = (result % M + prodResult % M);
			result = result % M;
		}

		return result;
	}

	static long findMMI(double n, int M) {
		long i = 1;
		while (i < M) {
			if ((i * n) % M == 1)
				return i;
			i++;
		}
		return -1;
	}

	static long moduloMultiplication(long a, long mmi_10, int mod) {
		long res = 0;
		a %= mod;
		while (mmi_10 > 0) {
			if ((mmi_10 & 1) == 1)
				res = (res + a) % mod;
			a = (2 * a) % mod;
			mmi_10 >>= 1;
		}
		return res;
	}

}
