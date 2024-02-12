//barChart -- print bars

import java.util.Scanner;

public class barChart {
	// Constant program variables
	public static final int NUMBERS = 5;
	public static final int MIN = 1;
	public static final int MAX = 30;
	
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 3");
		System.out.println("               Program 2\n");

		// Create the scanner
		Scanner input = new Scanner(System.in);
		// Initialize the output string
		String output = "";

		// For each number
		for (int i = 0; i < NUMBERS; i++) {
			// Prompt for input number
			System.out.printf("Enter number %d (%d-%d): ", i + 1, MIN, MAX);
			
			// Input the number
			int number = input.nextInt();
			// If the number is above the max, set it to the max
			if (number > MAX) {
				number = MAX;
			} else if (number < MIN) {
				// Else if the number is below the min, set it to the min
				number = MIN;
			}
			
			// Initialize the asterisks string
			String asterisks = "";
			// For the size of the number
			for (int a = 0; a < number; a ++) {
				// Add an asterisks
				asterisks += "*";
			}
			
			// Add the line to the output string
			output += String.format("\n%d: %s", i + 1, asterisks);
		}

		// Print the output
		System.out.println(output);
		// Close the scanner
		input.close();
	}
}
