//program2 -- 

import javax.swing.JOptionPane; // For GUI

public class program2 {
	// Enumeration for each day of the week
	enum DayOfWeek {
	  SUNDAY,
	  MONDAY,
	  TUESDAY,
	  WEDNESDAY,
	  THURSDAY,
	  FRIDAY,
	  SATURDAY
	}
	
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Final Project Assignment");
		System.out.println("               Program 2\n");
		
		// 2D array of business hours
		Time[][] businessHours = {
				//   Opening time          Closing Time
				{ new Time(9, 00, 00), new Time(15, 00, 00) },
				{ new Time(6, 00, 00), new Time(17, 00, 00) },
				{ new Time(6, 15, 00), new Time(17, 30, 00) },
				{ new Time(6, 30, 00), new Time(18, 00, 00) },
				{ new Time(6, 45, 00), new Time(18, 30, 00) },
				{ new Time(7, 00, 00), new Time(19, 00, 00) },
				{ new Time(7, 00, 00), new Time(17, 00, 00) }
		};
		
		// Create loop, closed when user cancel's input
		while (true) {
			// Input day
			String input = JOptionPane.showInputDialog("Sunday, Monday, Tuesday, Wednesday, Thurday, Friday, Saturday\n\nEnter a day:");
			// Break the loop (ending the program) if they select cancel
			if (input == null) break;
			
			// Initialize a message
			String message = "";
			try {
				// Get the DayOfWeek enumeration
				DayOfWeek day = DayOfWeek.valueOf(input.toUpperCase());
				
				// Store the opening and closing hours string by getting the business hours based off the enumeration index, then getting the first or second time in the array of hours
				String openString = businessHours[day.ordinal()][0].toString();
				String closeString = businessHours[day.ordinal()][1].toString();
				// Create the message string
				message = String.format("Business Hours for %s:%n%s - %s", input, openString, closeString);
			} catch (Exception e) {
				// If an error occurs, it is because the user selected invalid input
				message = "Invalid input.";
			}
			
			// Display the store hours and continue the loop
			JOptionPane.showMessageDialog(null, message);
		}
	}
}