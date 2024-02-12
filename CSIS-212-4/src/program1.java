//program1 -- checks if an input number is a multiple of another input number

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 4");
		System.out.println("               Program 1\n");
		
		// Create the scanner
		Scanner input = new Scanner(System.in);

		// For each number
		while (true) {
			// Prompt for input first number
			System.out.printf("Enter first number (or -1 to exit): ");
			// Input the first number
			int number1 = input.nextInt();
			if (number1 == -1) break;
			
			// Prompt for input second number
			System.out.printf("Enter second number: ");
			// Input the second number
			int number2 = input.nextInt();
			
			// Create a string saying is or is not if number2 is a multiple of number1
			String multiple = (isMultiple(number1, number2)) ? "is" : "is not";
			// Print the result
			System.out.printf("%d %s a multiple of %d\n\n", number2, multiple, number1);
		}

		// Close the scanner
		input.close();
	}
	
	/**
	 * calculates if int b is a multiple or int a
	 * @param a integer
	 * @param b integer
	 * @return boolean
	 */
	public static boolean isMultiple(int a, int b) {
		// if the remainder of a / b = 0 return true
		if (a % b == 0) {
			return true;
		} else {
			// Else return false
			return false;
		}
	}
}
