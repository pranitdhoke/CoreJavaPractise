/**
 * 
 */
package org.pranit.java.designpatterns.structural.flywieght;

/**
 * @author pdhoke
 *
 */
public class Circle implements Shape {

	private String colour;
	private int x;
	private int y;
	private int radius;

	public Circle(String colour) {
		super();
		this.colour = colour;
	}

	/**
	 * @param colour
	 *            the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.structural.flywieght.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Circle: Draw() " + this.toString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [colour=" + colour + ", x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}

}
