package sdet_java.task4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q3 {
	// Write a java program to count the number of occurrences of each character in
	// a given string. For example, If “Java J2EE Java JSP J2EE” is the given string
	// then occurrences of each character in this string is E=4, 2=2, v=2,  =4, P=1,
	// S=1, a=4, J=5 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String strVar = scanner.nextLine();
		scanner.close();
		char[] chrVar = strVar.toCharArray();
		for (int i = 0; i < chrVar.length; i++) {
			if (hashmap.containsKey(chrVar[i])) {
				hashmap.put(chrVar[i], hashmap.get(chrVar[i]) + 1);
			} else {
				hashmap.put(chrVar[i], 1);
			}
		}
		// Duplicate characters
		for (Entry<Character, Integer> entry : hashmap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
