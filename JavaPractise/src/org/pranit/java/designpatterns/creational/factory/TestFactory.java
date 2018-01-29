/**
 * 
 */
package org.pranit.java.designpatterns.creational.factory;

/**
 * @author Pranit Dhoke
 *
 */
public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Computer c1 = Factory.getInstance("PC", "1TB", "4 core", "8GB");
		Computer c2 = Factory.getInstance("Server", "500TB", "32 core", "200GB");
		
		System.out.println("Computer 1 is :" + c1);
		System.out.println("Computer 2 is :" + c2);

	}

}
