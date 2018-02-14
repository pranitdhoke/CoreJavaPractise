/**
 * 
 */
package org.pranit.java.designpatterns.structural.composite;

/**
 * @author pdhoke
 *
 */
public class Circle implements Shape {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pranit.java.designpatterns.structural.composite.Shape#draw(java.lang.
	 * String)
	 */
	@Override
	public void draw(String fillColour) {
		System.out.println("Drawing circle with colour: " + fillColour);
	}

}
