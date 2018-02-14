/**
 * 
 */
package org.pranit.java.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pdhoke
 *
 */
public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList<Shape>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pranit.java.designpatterns.structural.composite.Shape#draw(java.lang.
	 * String)
	 */
	@Override
	public void draw(String fillColour) {
		for (Shape shape : shapes) {
			shape.draw(fillColour);
		}

	}
	
	public void add(Shape shape){
		this.shapes.add(shape);
	}

	public void remove(Shape shape){
		this.shapes.remove(shape);
	}
	
	public void clear(){
		System.out.println("Clearing all the shapes form drawing.");
		this.shapes.clear();
	}
}
