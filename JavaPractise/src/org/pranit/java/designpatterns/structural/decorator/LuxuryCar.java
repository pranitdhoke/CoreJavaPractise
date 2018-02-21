/**
 * 
 */
package org.pranit.java.designpatterns.structural.decorator;

/**
 * @author pdhoke
 *
 */
public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {	
		super.assemble();
		System.out.println("Adding luxuary features to the car.");
	}
}
