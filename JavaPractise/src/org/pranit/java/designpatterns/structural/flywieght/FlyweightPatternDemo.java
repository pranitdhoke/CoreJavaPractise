/**
 * 
 */
package org.pranit.java.designpatterns.structural.flywieght;

/**
 * @author pdhoke
 *
 */
public class FlyweightPatternDemo {

	
	private static final String colours[]={"Red","Yellow","Blue","Pink","Purple"};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0;i<20;i++){
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColour());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	private static int getRandomY() {
		return (int) (Math.random()*100);
	}
	private static int getRandomX() {
		return (int) (Math.random()*100);
	}
	private static String getRandomColour() {
		return colours[(int) (Math.random()*colours.length)];
	}

}
