package coreJavaAssignments;

import java.util.Scanner;

public class DistanceProgram {
	public static void main(String args[]) {
		double x1, x2, y1, y2;

		double radius = 6371.01;

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Get the input from the console
		System.out.print("Input the latitude of coordinate 1 : ");
		x1 = Math.toRadians(scanner.nextDouble());

		System.out.print("Input the longitude of coordinate 1: ");
		y1 = Math.toRadians(scanner.nextDouble());

		System.out.print("Input the latitude of coordinate 2 : ");
		x2 = Math.toRadians(scanner.nextDouble());

		System.out.print("Input the longitude of coordinate 2: ");
		y2 = Math.toRadians(scanner.nextDouble());

		scanner.close();

		// Perform calculation
		double distance = radius
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		System.out.println("The distance between those points is: " + distance + " km");
	}
}
