package a.com;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

class MyClass {
	public static void consumeHeap() {
		while (true) {
			ArrayList<String> list = new ArrayList<String>(Integer.MAX_VALUE);
			System.out.println("consumeheap");
		}
	}

	public static void collect() {

		System.gc();

	}

	protected void finalize() throws Throwable {
		System.out.println("I am removing object");
	};
}

public class ReferenceDemo {

	public static void main(String[] args) {
		MyClass object = new MyClass();
		WeakReference<MyClass> weak = new WeakReference<MyClass>(object);
		// WeakHashMap<MyClass, String> map = new WeakHashMap<MyClass,
		// String>();
		HashMap<WeakReference<MyClass>, String> map = new HashMap<WeakReference<MyClass>, String>();
		map.put(weak, "data");
		System.out.println("collect 1");
		MyClass.collect();// not call
		object = null;
		System.out.println("collect 2");
		MyClass.collect();

		// MyClass object = new MyClass();// strong ref
		// SoftReference<MyClass> soft = new SoftReference<MyClass>(object);
		// System.out.println(object);
		// System.out.println("collect 1");
		// MyClass.collect();// not call
		// object = null;
		// // soft = null;
		// System.out.println("collect 2");
		// MyClass.collect();
		// System.out.println("calling method");
		// MyClass.consumeHeap();
		// // MyClass object1 = soft.get();
		// // System.out.println(object1);

	}
}
