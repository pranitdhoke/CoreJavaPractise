package com.b.c;

import java.util.Iterator;

class A1 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("task1 over");
		System.exit(0);
	}

}

class A2 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// TODO Auto-generated method stub
		System.out.println("task2 over");
	}

}

class T3 extends Thread {
	public void run() {
		System.out.println("Vishal");
	}
	public void fn1(){}
}

class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		T3 task = new T3();
		task.fn1();
		
		A1 tassk = new A1();
		task.start();
		task.start();
		// Thread t1 = new Thread(task);
		// Thread t2 = new Thread(task);
		// t1.start();
		// t2.start();

		// System.out.println(Thread.currentThread().getName());
		// // Thread.currentThread().setDaemon(true);
		// Thread t1 = new Thread(new A1(), "first");
		// Thread t2 = new Thread(new A2(), "second");
		// // t2.setDaemon(true);
		// System.out.println(t1.getName());
		// System.out.println(t2.getName());
		// // t1.setDaemon(true);
		// t1.start();
		// t2.start();
		// System.out.println("main over");
		// // Iterator itr =Thread.getAllStackTraces().entrySet().iterator();
		// // while(itr.hasNext())
		// // {
		// // System.out.println(itr.next());
		// // }

	}

}
