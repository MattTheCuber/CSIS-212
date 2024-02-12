//program1 -- program to view student GPAs

import javax.swing.JOptionPane; // For GUI

public class program1 {
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Final Project Assignment");
		System.out.println("               Program 1\n");

		// Create the student Ids, names, and GPAs
		int[] studentIds = { 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010 };
		String[] studentNames = { "Judd", "Liv", "Posie", "Raymond", "Jools", "Brianna", "May", "Kristopher", "Tessie", "Norris" };
		double[] studentGPAs = { 2.1, 4.0, 3.7, 3.1, 3.9, 1.1, 3.5, 2.6, 3.1, 4.0 };
		
		// Initialize an empty error message for later use
		String errorMessage = "";
		// Loop which will break later
		while (true) {
			// Create an input dialog and save the result
			String id = JOptionPane.showInputDialog(String.format("%sEnter a Student Id:", errorMessage));

			// If the result is null, the user hit cancel
			if (id == null) {
				// So we break the loop to end the program
				break;
			// If the id is the proper length and only numbers
			} else if (id.length() == 4 && id.matches("^[0-9]*$")) {
				// Get the index of the student id
				int index = indexOf(studentIds, Integer.parseInt(id));
				// If the index in invalid
				if (index == -1) {
					// Set the error message to describe the issue then continue the loop
					errorMessage = String.format("%s is not a valid Student Id%n%n", id);
					continue;
				}

				// Create and display the information for the student
				String message = String.format("%s%nStudent Id: %d%nGPA: %.1f", studentNames[index], studentIds[index], studentGPAs[index]);
				JOptionPane.showMessageDialog(null, message);
				// Break the loop to end the program
				break;
			} else {
				// Else set the error message to describe the issue then continue the loop
				errorMessage = String.format("%s is not a valid Studen Id.%nPlease enter a 4-digit number%n%n", id);
				continue;
			}
		}
	}
	
	/**
	 * Simple  method that returns the first index of a value in an integer array
	 * @param arr array
	 * @param val search integer
	 * @return index of that integer or -1 if not found
	 */
	public static int indexOf(int[] arr, int val) {
		// Set to -1 if it is never found
		int index = -1;
		// For each item in the int array
	    for (int i = 0; i < arr.length; i++) {
	    	// If the item is the search value
	        if (arr[i] == val) {
	        	// Store it as the index and stop searching
	            index = i;
	            break;
	        }
	    }
	    // Return the index
	    return index;
	}
}