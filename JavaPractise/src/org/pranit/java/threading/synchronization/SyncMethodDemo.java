package org.pranit.java.threading.synchronization;

public class SyncMethodDemo {

	private static int counter = 0;

	/**
	 * This method can cause inconsistency in case of multi-threaded environment.
	 * 
	 * Uncomment the below method to check the behaviour.
	 */
	// public static void increment() {
	// ++counter;
	// }

	/**
	 * This method is thread safe as synchronized keyword is implemented which helps
	 * to avoid the dirty read and writes.
	 */
	public static synchronized void increment() {
		++counter;
	}

	public static void process() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					increment();
				}
			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		process();
		System.out.println("Counter = " + counter);
	}

}
