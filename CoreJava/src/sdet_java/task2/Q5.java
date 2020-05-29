package sdet_java.task2;

import java.time.LocalDateTime;

public class Q5 {
	//Write a Java Program to Calculate Difference Between Two Time Periods 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateTime = LocalDateTime.of(2019, 10, 1, 11, 10);
		LocalDateTime dateTime1 = LocalDateTime.of(2020, 4, 28, 2, 18);
		long diffInHours = java.time.Duration.between(dateTime, dateTime1).toHours();
		System.out.println("The difference between two time in hours is : " + diffInHours);
	}

}
