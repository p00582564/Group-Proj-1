/**
	p00582564 / Group-Proj-1
	Cody, Tony, Themba, Carmen
	I added a branch called Group-Proj-1-sugfeats containing thls file for your review.
*/

// Cody, Tony, Themba, Carmen
public class GroupProj {

	public static void main(String[] args) {
		Box test1 = new Box();
		System.out.println("length is " + test1.getLength() );

		System.out.println();

		BoxHeight testBh1 = new BoxHeight();
		testBh1.show();
		System.out.println("Area is " + testBh1.getArea() );
		System.out.println("Perimeter is " + testBh1.getPerimeter() );
		System.out.println("Volume is " + testBh1.getVolume() );

		System.out.println();

		BoxHeight testBh2 = new BoxHeight(2, 2, 2);
		testBh2.show();
		System.out.println("Area is " + testBh2.getArea() );
		System.out.println("Perimeter is " + testBh2.getPerimeter() );
		System.out.println("Volume is " + testBh2.getVolume() );

		System.out.println();

	} // end of main
} // end of GroupProj

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

	void show() {
		System.out.println("length, width:  " + length + ", " + width + ". " );
	}

}// end of Box



/** Using inheritance subclass inherit from superclass
 */
class BoxHeight extends Box{
	private double height;

	BoxHeight() {
		super();
		height = 1;
	}

	BoxHeight(double inpLength, double inpWidth, double inpHeight) {
		super(inpLength, inpWidth);
		height = inpHeight;
	}

	void setLength(double newLength) {
		length = newLength;
	}

	void setWidth(double newWidth) {
		width = newWidth;
	}

	void setHeight(double newHeight) {
		height = newHeight;
	}

	double getLength() {
		return length;
	}

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	double getVolume() {
		return length * width * height;
	}

	void show() {
		System.out.println("length, width, height:  " + length + ", " + width + ", " + height + ". " );
	}

}// end of BoxHeight