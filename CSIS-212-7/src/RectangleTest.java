//RectangleTest -- demonstrates usage of Rectangle class

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 7\n");

		// Create the scanner
		Scanner input = new Scanner(System.in);
		// Create a Rectangle object
		Rectangle rectangle = new Rectangle();

		while (true) {
			// Prompt for input
			System.out.printf("1. Set Length%n2. Set Width%n3. Exit%nChoice: ");
			int choice = input.nextInt();

			try {
				// If 1 is entered
				if (choice == 1) {
					// Prompt for length
					System.out.printf("Enter length: ");
					// Set the rectangle's length to the input float
					rectangle.setLength(input.nextFloat());
				} else if (choice == 2) { // Else if 2 is entered
					// Prompt for width
					System.out.printf("Enter width: ");
					// Set the rectangle's length to the input float
					rectangle.setWidth(input.nextFloat());
				} else { // Else, break the loops
					break;
				}
			} catch (Exception e) {
				// Catch exception and print message
				System.out.println(e.getMessage());
				// Then break loop
				break;
			}
			
			// Print the rectangle's information
			System.out.printf("Rectangle dimensions are %s with a perimeter of %.2f and an area of %.2f.%n%n", rectangle.getDimensions(), rectangle.calculatePerimeter(), rectangle.calculateArea());
		}

		// Print exiting message
		System.out.println("Exiting program...");
		// Close the scanner
		input.close();
	}
}
