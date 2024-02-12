//program2 -- calculates the area of a circle

import java.util.Scanner;

public class program2 {
	// Constant variable
	public static final double PI = 3.1415926;
	
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 4");
		System.out.println("               Program 2\n");
		
		// Create the scanner
		Scanner input = new Scanner(System.in);

		// Prompt for input circle radius
		System.out.printf("Enter circle radius: ");
		// Input the circle radius
		int radius = input.nextInt();
		
		// Print the result
		System.out.printf("The area of a circle with a radius of %d is %.3f", radius, circleArea(radius));

		// Close the scanner
		input.close();
	}
	
	/**
	 * calculates area of a circle
	 * @param radius integer
	 * @return double of area
	 */
	public static double circleArea(int radius) {
		// Return area using the formula: pi*r^2
		return PI * radius * radius;
	}
}
