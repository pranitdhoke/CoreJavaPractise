package org.pranit.java.designpatterns.creational.singleton;

/**
 * Bill Pugh Singleton pattern
 * 
 * @author Pranit Dhoke
 *
 */
public class BillPughSingleton {

	public BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
