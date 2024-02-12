//program3 -- description

import java.util.Random;
import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 4");
		System.out.println("               Program 3\n");

		// Create the scanner
		Scanner input = new Scanner(System.in);
		// Create the random generator
		Random rand = new Random();
		
		// Initialize sentinel variable
		boolean correct = true;
		// While answer is correct
		while(correct) {
			// Ask a new question
			correct = askQuestion(input, rand);
		}

		// Close the scanner
		input.close();
	}
	
	/**
	 * calculates area of a circle
	 * @param input stream
	 * @param rand number generator
	 * @return boolean if they answered correctly
	 */
	public static boolean askQuestion(Scanner input, Random rand) {
		// Generate 2 random numbers from 0 to 12
		int number1 = rand.nextInt(12);
		int number2 = rand.nextInt(12);

		// Print the question
		System.out.printf("How much is %d times %d? ", number1, number2);
		// Gather the input
		int guess = input.nextInt();
		
		// If the answer is correct
		if (guess == number1 * number2) {
			// Print correct and return true
			System.out.println("Correct!\n");
			return true;
		} else {
			// Else print incorrect and return false
			System.out.printf("Incorrect. The correct answer was %d\n\n", number1 * number2);
			return false;
		}
	}
}
