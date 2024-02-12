//program2 -- rolls and sums 2 dice 36,000 times

import java.util.Random;

public class program2 {
	public static final int ROLLS = 36_000;
	
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 5");
		System.out.println("               Program 2\n");

		// Create the random generator
		Random rand = new Random();
		// Declare and create the integer array with 11 items (for 2-12)
		int[] results = new int[11];
		
		// For ROLLS times
		for (int i = 0; i < ROLLS; i++) {
			// Get a random dice roll sum
			int sum = rollSum(rand);
			// Add 1 to the array at the sum location - 2 (because 2 dice roll sums begin at 2)
			results[sum - 2]++;
		}

		// Print the table title
		System.out.printf("Number of sums for 2 dice rolled %,d times%n", ROLLS);
		// For each result
		for (int i = 0; i < results.length; i++) {
			// Print the index + 2 (because 2 dice roll sums begin at 2) and the number of sums for that number
			System.out.printf("%-3d %,5d%n", i + 2, results[i]);
		}
	}
	
	/**
	 * rolls 2 dice and returns the sum
	 * @param rand number generator
	 * @return int sum of 2 dice rolls
	 */
	public static int rollSum(Random rand) {
		// Roll 2 dies, creating a random number 0-5 then adding 1 creating the correct dice range of 1-6
		int roll1 = rand.nextInt(6) + 1;
		int roll2 = rand.nextInt(6) + 1;

		return roll1 + roll2;
	}
}
