/**
 * 
 */
package org.pranit.java.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * Class demonstrate how reflection can destroy the Singleton implementation.
 * 
 * @author Pranit Dhoke
 *
 */
public class TestDestroySingletonUsingReflection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EagerInitialisedSingleton instance1 = EagerInitialisedSingleton.getInstance();
		EagerInitialisedSingleton instance2 = null;
		try {
			Constructor[] constructors = EagerInitialisedSingleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (EagerInitialisedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Hashcode of instance 1 is : " + instance1.hashCode());
		System.out.println("Hashcode of instance 2 is : " + instance2.hashCode());
		
		System.out.println("Instance1 == Instance2 ? " + instance1.equals(instance2));
	}

}
