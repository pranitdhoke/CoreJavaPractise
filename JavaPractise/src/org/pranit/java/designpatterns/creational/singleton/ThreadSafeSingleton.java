/**
 * 
 */
package org.pranit.java.designpatterns.creational.singleton;

/**
 * @author Pranit Dhoke
 *
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;

	public ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (null == instance) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

}
