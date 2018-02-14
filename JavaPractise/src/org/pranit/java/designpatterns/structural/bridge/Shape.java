/**
 * 
 */
package org.pranit.java.designpatterns.structural.bridge;

/**
 * @author pdhoke
 *
 */
public abstract class Shape {

	protected Colour colour;

	public Shape(Colour colour) {
		this.colour = colour;
	}
	
	public abstract void applyColour(); 

}
