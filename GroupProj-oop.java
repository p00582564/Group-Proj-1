/**
	p00582564 / Group-Proj-1
	Cody, Tony, Themba, Carmen
	In the example below, encapsulation
	is demonstrated as an OOP concept
	in Java.  The variables are private or
	encapsulated.   Public methods are
	used to access private instance variables.
*/

/* Java requires a package for classes to work together.  In each class in the package add the package statement and import statement.  */

package oopdemo;

import oopdemo.*;
import java.util.Scanner;
import java.lang.System;

/* 
Save this class as OopDemo.java in the oopdemo package folder.  Remember to include the package statement and import statement.
*/
public class OopDemo{

	public static void main(String[] args) {
		
		/*  To demo oop concepts we  created a superclass object and a  subclass object using their default constructor (i.e. Box() and BoxHeight().  */

		Box box1 = new Box();  
		BoxHeight boxheight1 = new BoxHeight();  

		/* The first three assignment statements below will produce an error since instsnce variables are private. */

		// box1.length = 2; // ERROR
		// box1.width = 4;  // ERROR

		/* Here, we demo the superclass's access.  Encapsulated - private instance variables (length, width) in the Box superclass.  So, we used the superclass's setters to assign values.  */

		box1.setLength(2);
		box1.setWidth(4);

		System.out.println();
	
		System.out.println("box1 with.." );
		box1.show();
		System.out.println("length is " + box1.getLength() );
		System.out.println("width is " + box1.getWidth() );
		System.out.println("Area is " + box1.getArea() );
		System.out.println("Perimeter is " + box1.getPerimeter() );
		
		System.out.println();

		/* Here, we demo the subclass's access.  Encapsulated - private instance variables (length, width) in the Box superclass.  So, we used the superclass's setters to assign values.  And, encapsulated - private instance variable (height) in the BoxHeight subclass.  So, we used the subclass's setter to assign values.   */

		/* The first three assignment statements below will produce an error since instsnce variables are private. */

		// boxheight1.length = 3; // ERROR
		// boxheight1.width = 6;  // ERROR
		// boxheight1.height = 9;  // ERROR
		
		boxheight1.setLength(3);
		boxheight1.setWidth(6);
		boxheight1.setHeight(9);
		
		System.out.println();
		
		System.out.println("boxheight1 with..." );
		boxheight1.show();
		System.out.println("length is " + boxheight1.getLength() );
		System.out.println("width is " + boxheight1.getWidth() );
		System.out.println("height is " + boxheight1.getHeight() );
		System.out.println("Area is " + boxheight1.getArea() );
		System.out.println("Perimeter is " + boxheight1.getPerimeter() );
		System.out.println("Volume is " + boxheight1.getVolume() );

		System.out.println();

	} // end of main
} // end of OopDemo class


/* 
Save this class as Box.java in the oopdemo package folder.  Remember to include the package statement and import statement.
*/
class Box {
	/*
		encapsulated instance variable.
  */

	private double length;
	private double width;

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


}// end of Box class


/* 
Save this class as BoxHeight.java in the oopdemo package folder.  Remember to include the package statement and import statement.
*/
class BoxHeight extends Box{

	/* Here, BoxHeight extends Box.   The super reserved word is used to access the superclass's private (i.e. encapsulated) instance variable  members within the subclsss. 
 */

	private double height; 

	BoxHeight() {
		super();      // calling Box()
		height = 1;   
	}

	BoxHeight(double inpLength, double inpWidth, double inpHeight) {
		//calling Box(with like parameters)
		super(inpLength, inpWidth);
		height = inpHeight;
	}

	void setHeight(double newHeight) {
		height = newHeight;
	}

	double getHeight() {
		return height;
	}

	double getVolume() {
		return super.getLength() * super.getWidth() * getHeight();
	}

	void show() {
		System.out.println("length, width, height:  " + super.getLength() + ", " + super.getWidth() + ", " + getHeight() + ". " );
	}


	/*
	- BoxHeight inherits from Box: setLength(), setWidth(), getLength(), getWidth(), getArea(), getPerimeter().
	- BoxHeight adds its own members to the class hierarchy chain: height, setHeight, getHeight, getVolume(). 
	- BoxHeight overrides Box's member: Show().  
	*/

}// end of BoxHeight class

