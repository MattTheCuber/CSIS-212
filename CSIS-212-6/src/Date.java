//Date -- simple class for working with dates

public class Date {
	// Instance variables
	private int month;
	private int day;
	private int year;

	// Constructor with month, day, and year arguments
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	// Getters and setters for month
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	// Getters and setters for day
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	// Getters and setters for year
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// Return a string of the Date object
	public String displayDate() {
		return String.format("%d/%d/%d", this.month, this.day, this.year);
	}
}
