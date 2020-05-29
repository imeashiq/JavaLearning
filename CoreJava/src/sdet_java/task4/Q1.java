package sdet_java.task4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q1 {
	// Write a java program to find duplicate characters and their count in a given
	// string. For example, in a string “Better Butter”, duplicate characters and
	// their count is t : 4, e : 3, r : 2 and B : 2
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
		System.out.println("Duplicate characters are : ");
		for (Entry<Character, Integer> entry : hashmap.entrySet()) {
			if (Integer.parseInt(entry.getValue().toString()) > 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}

}
