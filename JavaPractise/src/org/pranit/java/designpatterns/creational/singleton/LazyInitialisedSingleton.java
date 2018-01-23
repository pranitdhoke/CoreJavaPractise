package org.pranit.java.designpatterns.creational.singleton;

/**
 * This class is useful in single threaded environment.
 * @author Pranit Dhoke
 */
public class LazyInitialisedSingleton {
	private static LazyInitialisedSingleton instance;

	private LazyInitialisedSingleton() {
	}

	public static LazyInitialisedSingleton getInstance() {
		if (null == instance) {
			instance = new LazyInitialisedSingleton();
		}
		return instance;
	}

}
