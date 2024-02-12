//oddProduct -- calculates the product of the odd integers from 1 to 15

public class oddProduct {
	// Constant program variables
	public static final int MIN = 1;
	public static final int MAX = 15;
	
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 3");
		System.out.println("               Program 1\n");
		
		// Initialize the product
		int product = 1;
		// For every other number between the min and max numbers
		for (int i = MIN; i <= MAX; i += 2) {
			product *= i;
		}
		
		// Display the output result
		System.out.printf("The product of all the odd number from %d to %d is %,d", MIN, MAX, product);
	}
}
