package sdet_java.task4;

import java.util.Scanner;

public class Q10 {
	/*
	 * Given a string, your code must find out the first repeated as well as
	 * non-repeated character in that string. For example, if “JavaConceptOfTheDay”
	 * is the given string, then ‘J’ is a first non-repeated character and ‘a’ is a
	 * first repeated character 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		char[] chr = str.toCharArray();
		findDuplicate(chr);
		findNonDuplicate(chr);
		scanner.close();
	}

	static void findDuplicate(char[] chr) {
		boolean isRepeated = false;
		for (int i = 0; i < chr.length - 1; i++) {
			for (int j = 1; j < chr.length; j++) {
				if (chr[i] == chr[j]) {
					System.out.println("The first repeated char in the given string is : " + chr[i]);
					isRepeated = true;
					break;
				}
			}
			if (isRepeated)
				break;
		}
	}

	static void findNonDuplicate(char[] chr) {
		boolean isNonRepeated = false;
		for (int i = 0; i < chr.length - 1; i++) {
			for (int j = 1; j < chr.length; j++) {
				if (chr[i] != chr[j]) {
					isNonRepeated = true;
				}
			}
			if (isNonRepeated) {
				System.out.println("The first non-repeated char in the given string is : " + chr[i]);
				break;
			}
		}
	}

}
