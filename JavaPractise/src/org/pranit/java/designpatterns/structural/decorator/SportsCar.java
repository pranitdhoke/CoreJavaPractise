/**
 * 
 */
package org.pranit.java.designpatterns.structural.decorator;

/**
 * @author pdhoke
 *
 */
public class SportsCar extends CarDecorator {
	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {	
		super.assemble();
		System.out.println("Adding supercharger with 600BHP engine.");
	}
}
