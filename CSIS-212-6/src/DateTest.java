//dateTest -- demonstrates usage of Date class

public class DateTest {
	private static final int MONTH = 2;
	private static final int DAY = 15;
	private static final int YEAR = 2022;
	
	public static void main(String[] args) {
		System.out.println("Matthew Vine - Assignment 6");

		// Create a date object
		Date date = new Date(MONTH, DAY, YEAR);
		// Print the date using the display date function
		System.out.printf("Today is %s\n", date.displayDate());

		// Set the date's month, day, and year
		date.setMonth(8);
		date.setDay(26);
		date.setYear(2017);
		// Print the new date
		System.out.printf("Using the month 2, day 26, and year 2017 the date is %s", date.displayDate());
	}
}
