/**
 * 
 */
package org.pranit.java.designpatterns.structural.composite;

/**
 * @author pdhoke
 *
 */
public class Triangle implements Shape {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pranit.java.designpatterns.structural.composite.Shape#draw(java.lang.
	 * String)
	 */
	@Override
	public void draw(String fillColour) {
		System.out.println("Drawing triangle with colour: " + fillColour);
	}

}
