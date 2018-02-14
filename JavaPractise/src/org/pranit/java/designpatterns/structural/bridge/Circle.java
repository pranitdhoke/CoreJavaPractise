/**
 * 
 */
package org.pranit.java.designpatterns.structural.bridge;

/**
 * @author pdhoke
 *
 */
public class Circle extends Shape {

	public Circle(Colour colour) {
		super(colour);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.structural.bridge.Shape#applyColour()
	 */
	@Override
	public void applyColour() {
		System.out.println("Circle filled with colour");
		colour.applyColour();
	}

}
