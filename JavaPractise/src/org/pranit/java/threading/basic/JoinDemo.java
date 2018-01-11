package org.pranit.java.threading.basic;

public class JoinDemo {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable1());
		Thread thread2 = new Thread(new Runnable2());

		thread1.start();
		thread2.start();
		
		boolean join =true;
		
		if (join) {
			try {
				thread1.join();
				thread2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Task finished......");
	}

}
