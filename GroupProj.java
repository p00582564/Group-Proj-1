//Cody, Tony, Themba, Carmen

public class GrouProj {

	public static void main(String[] args) {
		Box test1 = new Box();
		// no closing instance of type is available
	} // end of main
}

class Box {
	private double length, width;

	Box() {
		length = 1;
		width = 1;
	}

	Box(double inpLength, double inpWidth) {
		length = inpLength;
		width = inpWidth;
	}

	void setLength(double newLength) {
		length = newLength;
	}

	void setWidth(double newWidth) {
		width = newWidth;
	}

	double getLength() {
		return length;
	}

	double getWidth() {
		return width;
	}

	double getArea() {
		return length * width;
	}

	double getPerimeter() {
		return 2 * length + 2 * width;
	}

}// end of Box
