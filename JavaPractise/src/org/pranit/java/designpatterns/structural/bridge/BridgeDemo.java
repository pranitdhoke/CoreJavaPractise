/**
 * 
 */
package org.pranit.java.designpatterns.structural.bridge;

/**
 * @author pdhoke
 *
 */
public class BridgeDemo {
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle(new RedColour());
		triangle.applyColour();
		System.out.println("\n************************************\n");
		Circle circle = new Circle(new GreenColour());
		circle.applyColour();
		System.out.println("\n************************************\n");
		Pentagon pentagon = new Pentagon(new RedColour());
		pentagon.applyColour();
	}

}
