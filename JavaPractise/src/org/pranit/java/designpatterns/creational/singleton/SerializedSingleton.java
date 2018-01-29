/**
 * 
 */
package org.pranit.java.designpatterns.creational.singleton;

import java.io.Serializable;

/**
 * Singleton Class that uses serialization.
 * 
 * @author Pranit Dhoke
 *
 */
public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -362087464960588608L;

	public SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton INSTANCE = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	/**
	 * Comment or uncomment the below method to see the behaviour.
	 * 
	 * If this method is not present then deserialization breaks the singleton
	 * pattern as we get a new object of singleton class after deserialzation.
	 * 
	 * @return
	 */
//	protected Object readResolve() {
//		return getInstance();
//	}
}
