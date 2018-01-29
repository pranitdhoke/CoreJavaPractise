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
		testThreadSafeSingleton();
		testDoubleCheckSingleton();
		testBillPughSingleton();
		testEnumSingleton();
	}

	private static void testEnumSingleton() {
		EnumSingleton singleton1 = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		singleton1.setValue(2);
		System.out.println("Hashcode of obj1 of EnumSingleton is: " + singleton1.hashCode());
		System.out.println("Hashcode of obj2 of EnumSingleton is: " + singleton2.hashCode());
		System.out.println(singleton1.getValue());
		
		
	}

	private static void testBillPughSingleton() {
		BillPughSingleton obj1 = BillPughSingleton.getInstance();
		BillPughSingleton obj2 = BillPughSingleton.getInstance();
		System.out.println("Hashcode of obj1 of BillPughSingleton is: " + obj1.hashCode());
		System.out.println("Hashcode of obj2 of BillPughSingleton is: " + obj2.hashCode());
		System.out.println(obj1 == obj2);
	}

	private static void testDoubleCheckSingleton() {
		DoubleCheckSingleton obj1 = DoubleCheckSingleton.getInstance();
		DoubleCheckSingleton obj2 = DoubleCheckSingleton.getInstance();
		System.out.println("Hashcode of obj1 of DoubleCheckSingleton is: " + obj1.hashCode());
		System.out.println("Hashcode of obj2 of DoubleCheckSingleton is: " + obj2.hashCode());
		System.out.println(obj1 == obj2);
	}

	private static void testThreadSafeSingleton() {
		ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();
		System.out.println("Hashcode of obj1 of ThreadSafeSingleton is: " + obj1.hashCode());
		System.out.println("Hashcode of obj2 of ThreadSafeSingleton is: " + obj2.hashCode());
		System.out.println(obj1 == obj2);
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