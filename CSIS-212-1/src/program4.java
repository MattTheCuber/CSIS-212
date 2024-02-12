//program4 -- find the sum, product, difference, and quotient of 2 given number
//CSIS 212-B01

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 1");
		System.out.println("               Program 4\n");

		// Create the scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt for and input 2 numbers
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();

		// Print the sum, product, and difference
		System.out.printf("\nSum: %d\n", number1 + number2);
		System.out.printf("Product: %d\n", number1 * number2);
		System.out.printf("Difference: %d\n", number1 - number2);
		// If the number is 0 (undivisible) print undefined
		if (number2 == 0) {
			System.out.print("Quotient: undefined");
		} else {
			// Else print the quotient
			System.out.printf("Quotient: %d", number1 / number2);
		}

		// Close the scanner
		input.close();
	}
}