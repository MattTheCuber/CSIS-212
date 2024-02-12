//Date -- simple class for working with rectangles

public class Rectangle {
	// Instance variables
	private float length;
	private float width;

	// Constructor with default length and width of 1
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}

	// Getters and setters
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if (length < 0.0f || length > 20.0f) {
			throw new IllegalArgumentException("Length must be from 0.0 to 20.0");
		}
		this.length = length;
	}

	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		if (width < 0.0f || width > 20.0f) {
			throw new IllegalArgumentException("Width must be from 0.0 to 20.0");
		}
		this.width = width;
	}

	// Returns perimeter of rectangle
	public float calculatePerimeter() {
		return this.length * 2 + this.width * 2;
	}

	// Returns area of rectangle
	public float calculateArea() {
		return this.length * this.width;
	}

	// Returns dimensions of rectangle
	public String getDimensions() {
		return String.format("%.2fx%.2f", this.length, this.width);
	}
}
