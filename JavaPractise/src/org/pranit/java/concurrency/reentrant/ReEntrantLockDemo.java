package org.pranit.java.concurrency.reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLockDemo {
	private static int counter = 0;
	private static Lock lock = new ReentrantLock();

	public static void increment() {
		lock.lock();
		try {
			for (int i = 0; i < 1000; i++)
				counter++;
		} finally {
			lock.unlock();
		}

	}

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				increment();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				increment();
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Counter is : " + counter);
	}
}
