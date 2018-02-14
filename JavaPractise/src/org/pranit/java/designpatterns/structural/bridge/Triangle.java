/**
 * 
 */
package org.pranit.java.designpatterns.structural.bridge;

/**
 * @author pdhoke
 *
 */
public class Triangle extends Shape {

	public Triangle(Colour colour) {
		super(colour);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.structural.bridge.Shape#applyColour()
	 */
	@Override
	public void applyColour() {
		System.out.println("Triangle filled with colour");
		colour.applyColour();
	}

}
