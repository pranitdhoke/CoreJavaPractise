package org.pranit.java.threading.basic;

class Runnable1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runnable 1 = " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Runnable2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runnable 2 = " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		Thread t1 =new Thread(new Runnable1());
		Thread t2 = new Thread(new Runnable2());
		t1.start();
		t2.start();
	}
}
