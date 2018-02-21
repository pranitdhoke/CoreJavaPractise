/**
 * 
 */
package org.pranit.java.designpatterns.structural.decorator;

/**
 * @author pdhoke
 *
 */
public class DecoratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		
		System.out.println("\n********************************\n");
		Car luxuryCar = new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
				

	}

}
