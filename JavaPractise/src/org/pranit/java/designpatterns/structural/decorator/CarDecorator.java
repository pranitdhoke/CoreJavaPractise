/**
 * 
 */
package org.pranit.java.designpatterns.structural.decorator;

/**
 * @author pdhoke
 *
 */
public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.structural.decorator.Car#assemble()
	 */
	@Override
	public void assemble() {
		this.car.assemble();
	}

}
