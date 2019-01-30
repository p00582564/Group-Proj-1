/**
	p00582564 / Group-Proj-1
	Cody, Tony, Themba, Carmen
	In the example below, encapsulation
	is demonstrated as an OOP concept
	in Java.  The variables are private or
	encapsulated.   Public methods are
	used to access private variables.
*/

import java.util.Scanner;
import java.lang.System;


//save as BoxTest.java
public class BoxTest {

	public static void main(String[] args) {
		
		Box test1 = new Box();
		System.out.println("length is " + test1.getLength() );
		System.out.println("width is " + test1.getWidth() );

		System.out.println();

		test1.setLength(2);
		test1.setWidth(2);

		System.out.println

		test1.show();
		System.out.println("Area is " + test1.getArea() );
		System.out.println("Perimeter is " + test1.getPerimeter() );
		
		System.out.println();

		Box test2 = new Box(2, 2);
		test2.show();

		System.out.println();


	} // end of main
} // end of BoxTest


//save as Box.java
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


