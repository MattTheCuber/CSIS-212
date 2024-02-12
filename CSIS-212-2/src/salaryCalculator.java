//salaryCalculator -- calculates salary with given console information
//CSIS 212-B01

import java.util.Scanner;

public class salaryCalculator {
	// Constant employee count
	public static final int EMPLOYEE_COUNT = 3;
	
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 2");
		
		// Create the scanner
		Scanner input = new Scanner(System.in);
		
		// For each employee
		for (int i = 1; i <= EMPLOYEE_COUNT; i++) {
			// Print employee number
			System.out.printf("\nEmployee %d\n", i);

			// Prompt for and rate and hour
			System.out.print("Enter hourly rate: ");
			double rate = input.nextDouble();
			System.out.print("Enter hours worked: ");
			int hours = input.nextInt();
			
			// Calculate pay
			double pay = 0;
			// If hours is over 40
			if (hours > 40) {
				// Find overtime hours
				int overtime = hours - 40;
				// Find base pay
				pay = rate * 40;
				// Add time and a half overtime pay
				pay += overtime * rate * 1.5;
			} else {
				// Else calculate normal pay
				pay = rate * hours;
			}
			
			// Print employee payment
			System.out.printf("Pay for employee %d is $%.2f\n", i, pay);
		}

		// Close the scanner
		input.close();
	}
}