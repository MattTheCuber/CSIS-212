// Time class declaration

public class Time {
	private int hour; // 0-24
	private int minute; // 0-59
	private int second; // 0-59

	public Time(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}

	// return a String of the form hour:minute:second
	public String toString() {
		return String.format("%2d:", this.hour) + String.format("%2d:%2d", this.minute, this.second).replace(' ', '0');
	}

	public int getHour() {
		return this.hour;
	}

	public void setHour(int hour) {
		// check if hour in range
		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("hour (" + hour + ") must be 0-23");
		}
		this.hour = hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		// check if minute in range
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("minute (" + minute + ") must be 0-59");
		}
		this.minute = minute;
	}

	public int getSecond() {
		return this.second;
	}

	public void setSecond(int second) {
		// check if second in range
		if (second < 0 || second > 59) {
			throw new IllegalArgumentException("second (" + second + ") must be 0-59");
		}
		this.second = second;
	}
}