/**
 * 
 */
package org.pranit.java.designpatterns.structural.adapter;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @author Pranit Dhoke
 *
 */
public class AdapterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		testClassAdapter();
		System.out.println("***************************************\n");
		testObjectAdapter();

	}

	private static void testObjectAdapter() {
		System.out.println("Object Adapter demo");
		SocketAdapter adapter = new SocketObjectAdapterImpl();
		Volt v3 =getvolt(adapter, 3);
		Volt v12 =getvolt(adapter, 12);
		Volt v120 =getvolt(adapter, 120);
		
		System.out.println("Volt v3 value: "+ v3.getVolt());
		System.out.println("Volt v12 value: "+ v12.getVolt());
		System.out.println("Volt v120 value: "+ v120.getVolt());

	}

	private static void testClassAdapter() {
		System.out.println("Class Adapter demo");
		SocketAdapter adapter = new SocketClassAdapterImpl();
		Volt v3 =getvolt(adapter, 3);
		Volt v12 =getvolt(adapter, 12);
		Volt v120 =getvolt(adapter, 120);
		
		System.out.println("Volt v3 value: "+ v3.getVolt());
		System.out.println("Volt v12 value: "+ v12.getVolt());
		System.out.println("Volt v120 value: "+ v120.getVolt());

	}

	private static Volt getvolt(SocketAdapter adapter, int i) {
		switch (i) {
		case 3:
			return adapter.get3Volt();
		case 12:
			return adapter.get12Volt();
		case 120:
			return adapter.get120Volt();
		default:
			return adapter.get120Volt();
		}
	}

}
