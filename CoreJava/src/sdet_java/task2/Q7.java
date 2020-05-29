package sdet_java.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7 {
	//Write a Java Program to Convert String to Date 
	public static void main(String[] args) {
		//Conversion of String to date
		String date = "2020-04-27";
		LocalDate convertedDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
		System.out.println(convertedDate);
	}
}
