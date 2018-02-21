/**
 * 
 */
package org.pranit.java.designpatterns.structural.decorator;

/**
 * @author pdhoke
 *
 */
public class BasicCar implements Car {

	/* (non-Javadoc)
	 * @see org.pranit.java.designpatterns.structural.decorator.Car#assemble()
	 */
	@Override
	public void assemble() {
		System.out.println("Basic car assembled...");
	}

}
