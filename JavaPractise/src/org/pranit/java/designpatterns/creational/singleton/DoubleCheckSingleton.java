/**
 * 
 */
package org.pranit.java.designpatterns.creational.singleton;

/**
 * @author Pranit Dhoke
 *
 */
public class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance;

	public DoubleCheckSingleton() {
	}

	public static synchronized DoubleCheckSingleton getInstance() {
		if (null == instance) {
			synchronized (DoubleCheckSingleton.class) {
				instance = new DoubleCheckSingleton();
			}
		}
		return instance;
	}

}
