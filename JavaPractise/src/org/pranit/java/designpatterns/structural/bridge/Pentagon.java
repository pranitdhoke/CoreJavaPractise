/**
 * 
 */
package org.pranit.java.designpatterns.structural.bridge;

/**
 * @author pdhoke
 *
 */
public class Pentagon extends Shape {

	public Pentagon(Colour colour) {
		super(colour);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.structural.bridge.Shape#applyColour()
	 */
	@Override
	public void applyColour() {
		System.out.println("Pentagon filled with colour");
		colour.applyColour();
	}

}
