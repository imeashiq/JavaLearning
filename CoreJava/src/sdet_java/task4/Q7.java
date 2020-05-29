package sdet_java.task4;

import java.util.Scanner;

public class Q7 {
	/*
	 * Write a java program to check whether one string is a rotation of another.
	 * For example, If “JavaJ2eeStrutsHibernate” is a string then some rotated
	 * versions of this string are “StrutsHibernateJavaJ2ee”,
	 * “J2eeStrutsHibernateJava“, “HibernateJavaJ2eeStruts“
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String : ");
		String str1 = scanner.next();
		System.out.println("Enter the secong String : ");
		String str2 = scanner.next();
		scanner.close();
		if (isRotation(str1, str2))
			System.out.println("Yes it is a rotation of given string.");
		else
			System.out.println("No it is not a rotation of given string.");
	}

	static boolean isRotation(String str1, String str2) {
		boolean bln = false;
		if (str1.length() != str2.length()) {
			return false;
		} else {
			String str3 = str1 + str2;
			if (str3.contains(str2))
				bln = true;
		}
		return bln;
	}

}
