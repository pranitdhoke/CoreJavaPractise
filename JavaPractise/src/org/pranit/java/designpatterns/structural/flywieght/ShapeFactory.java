/**
 * 
 */
package org.pranit.java.designpatterns.structural.flywieght;

import java.util.HashMap;

/**
 * @author pdhoke
 *
 */
public class ShapeFactory {

	@SuppressWarnings("rawtypes")
	private static final HashMap circleMap = new HashMap();

	@SuppressWarnings("unchecked")
	public static Shape getCircle(String colour) {
		Circle circle = (Circle) circleMap.get(colour);

		if (null == circle) {
			circle = new Circle(colour);
			circleMap.put(colour, circle);
			System.out.println("Creating circle of colour : " + colour);
		}
		return circle;
	}
}
