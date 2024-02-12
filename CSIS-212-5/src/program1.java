//program1 -- calculates the product of an array of numbers

public class program1 {
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 5");
		System.out.println("               Program 1\n");

		// Declare and create the array
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// Calculate the product of the array
		int product = product(numbers);
		
		// If the array length is 0
		if (numbers.length == 0) {
			// Print that it is an empty array
			System.out.println("The given array is empty!");
		} else {
			// Else print the length of the array and the product
			System.out.printf("The product is the given array with a length of %d is %,d", numbers.length, product);
		}
	}
	
	/**
	 * calculates the product of an array of numbers
	 * @param numbers array of numbers
	 * @return int product of numbers
	 */
	public static int product(int[] numbers) {
		// Initialize product variable
		int product = 1;
		
		// For each number in the array or numbers
		for (int number : numbers) {
			// Multiply and set it to the product
			product *= number;
		}
		
		return product;
	}
}
