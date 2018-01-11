package com.an;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tassk implements Runnable {
	static int count = 0;

	// @Override
	// public Tassk call() throws Exception {
	// // TODO Auto-generated method stub
	// return null;
	// }

	@Override
	public void run() {
		// synchronized (this) {
		count++;
		for (int i = 0; i < 5; i++) {
			System.out.println(count + "" + i
					+ Thread.currentThread().getName());
			if (count == 1) {
				System.out.println("throwing");
				throw new ArithmeticException("I am exception");

			}
		}
		// }

	}

}

public class ExecutorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tassk t = new Tassk();
		// Thread t1 = new Thread(t);
		// Thread t2 = new Thread(t);
		// Thread t3 = new Thread(t);
		// Thread t4 = new Thread(t);
		// t1.start();
		// t2.start();
		// t3.start();
		// t4.start();
		ExecutorService ex = Executors.newFixedThreadPool(2);
		ex.submit(t);
		ex.submit(t);
		ex.submit(t);
		ex.submit(t);
		ex.shutdown();

	}

}
