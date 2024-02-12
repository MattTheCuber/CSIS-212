//program5 -- finds if a number is a multiple of another number
//CSIS 212-B01

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 1");
		System.out.println("               Program 5\n");

		// Create the scanner
		Scanner input = new Scanner(System.in);

		// Prompt for and input 2 numbers
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();

		// If the number is 0 (undivisible) print can't divide by 0
		if (number1 == 0) {
			System.out.printf("\nCan't divide by 0");
		} else if (number2 % number1 == 0) {
			// Else if there is no remainder print that it is a multiple
			System.out.printf("\n%d is a multiple of %d", number1, number2);
		} else {
			// Else if there is a remainder print that it is not a multiple
			System.out.printf("\n%d is NOT a multiple of %d", number1, number2);
		}

		// Close the scanner
		input.close();
	}
}