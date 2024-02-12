//program2 -- inputs someone's name and sends them a welcome message
//CSIS 212-B01

import javax.swing.JOptionPane; // For GUI

public class program2 {
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 1");
		System.out.println("               Program 2\n");
		
		// Get name from user
		String name = JOptionPane.showInputDialog("Enter your name:");
		// If the user selects cancel change the name to an empty string
		if (name == null) {
			name = "";
		} else { // Else format the string to include punctuation
			name = String.format(", %s,", name);
		}
		
		// Create the welcome message
		String message = String.format("Welcome%s To The Liberty University Website!\r\nThe Scripture for the day is: Matthew 6:11", name);
		// Show the dialog with the message
		JOptionPane.showMessageDialog(null, message);
	}
}