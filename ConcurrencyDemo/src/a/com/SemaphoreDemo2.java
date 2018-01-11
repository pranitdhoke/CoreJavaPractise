package a.com;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo2 implements Runnable {

	private Semaphore read = new Semaphore(2);
	private Semaphore write = new Semaphore(2);
	private static int a = 0;

	@Override
	public void run() {

		try {
			read.acquire();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			print();
			System.out.println(Thread.currentThread().getName() + " value "
					+ (a++));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		/*
		 * if ("1".equals(Thread.currentThread().getName())) { //read.release();
		 * System.out.println(Thread.currentThread().getName()+ " Released"); }
		 */

		read.release();

	}

	public void print() {

		try {
			write.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " " + (a++));
		write.release();
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Runnable r = new SemaphoreDemo2();

		new Thread(r, "1").start();
		new Thread(r, "2").start();
	}

}
