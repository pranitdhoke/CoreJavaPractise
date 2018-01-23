package org.pranit.java.designpatterns.creational.singleton;

/**
 * This is Test class to test all the Singleton implementations
 * 
 * @author Pranit Dhoke
 *
 */
public class TestSingleton {
	public static void main(String[] args) {
		testEagerSingleton();
		testStaticBlockSingleton();
		testLazyInitialisedSingleton();
	}

	private static void testLazyInitialisedSingleton() {
		LazyInitialisedSingleton obj1 = LazyInitialisedSingleton.getInstance();
		LazyInitialisedSingleton obj2 = LazyInitialisedSingleton.getInstance();
		System.out.println("Hashcode of obj1 of LazyInitialisedSingleton is: " + obj1.hashCode());
		System.out.println("Hashcode of obj2 of LazyInitialisedSingleton is: " + obj2.hashCode());
		System.out.println(obj1 == obj2);
	}

	private static void testStaticBlockSingleton() {

		StaticBlockSingleton obj1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton obj2 = StaticBlockSingleton.getInstance();
		System.out.println("Hashcode of obj1 of StaticBlockSingleton is: " + obj1.hashCode());
		System.out.println("Hashcode of obj2 of StaticBlockSingleton is: " + obj2.hashCode());
		System.out.println(obj1 == obj2);

	}

	private static void testEagerSingleton() {
		EagerInitialisedSingleton obj1 = EagerInitialisedSingleton.getInstance();
		EagerInitialisedSingleton obj2 = EagerInitialisedSingleton.getInstance();
		System.out.println("Hashcode of obj1 of EagerInitialisedSingleton is: " + obj1.hashCode());
		System.out.println("Hashcode of obj2 of EagerInitialisedSingleton is: " + obj2.hashCode());
		System.out.println(obj1 == obj2);
	}
}