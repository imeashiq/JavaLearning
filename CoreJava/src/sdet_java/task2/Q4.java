package sdet_java.task2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q4 {
	//Write a Java Program to Find the Frequency of Character in a String 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = scanner.next().toLowerCase();
		scanner.close();
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			if (frequency.containsKey(chr[i]))
				frequency.put(chr[i], frequency.get(chr[i]) + 1);
			else
				frequency.put(chr[i], 1);
		}
		for (Entry<Character, Integer> etr : frequency.entrySet()) {
			System.out.println("The frequency of char " + etr.getKey() + " is : " + etr.getValue());
		}
	}

}
