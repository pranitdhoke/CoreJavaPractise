/**
 * 
 */
package org.pranit.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pranit Dhoke
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		System.out.println("Demo 1 *****************************");
		arrayListDemo.generalArrayList();
		System.out.println("Demo 2 *****************************");
		arrayListDemo.allOperations();
		System.out.println("Demo 3 *****************************");
		List<Integer> integers = arrayListDemo.initialise();
		arrayListDemo.understandOperations(integers);

	}

	private void understandOperations(List<Integer> integers) {
		/*
		 * By this time integers has only empty ArrayList assigned to it. Thus there is
		 * no memory allocated for the list.
		 * 
		 */
		System.out.println("Integer Array is " + integers);
		System.out.println("Integer Array size is " + integers.size());

		integers.add(1);

	}

	/**
	 * ArrayList example which can holds different types of objects.
	 */
	private void generalArrayList() {
		List<Object> list = new ArrayList<Object>();
		list.add("a");
		list.add(new Integer(5));
		list.add(new Long(123456L));
		System.out.println(list);
	}

	/**
	 * An arraylist is initialized here and reference is returned.
	 * @return
	 */
	private ArrayList<Integer> initialise() {
		return new ArrayList<Integer>();
	}

	private void allOperations() {
		System.out.println("Creating Arraylist.....");
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Initial size of Arraylist is : " + list.size());
		System.out.println("Adding A");
		list.add("A");
		System.out.println("Adding B");
		list.add("B");
		System.out.println("List Data:" + list);
		System.out.println("Remove Object at index 1");
		list.remove(1);
		System.out.println("List Data:" + list);
		System.out.println("Remove A");
		list.remove("A");
		System.out.println("List Data:" + list);
		System.out.println("Size of List: " +list.size());
		list.ensureCapacity(15);
		System.out.println("Size of List: " +list.size());
		
	}
}
