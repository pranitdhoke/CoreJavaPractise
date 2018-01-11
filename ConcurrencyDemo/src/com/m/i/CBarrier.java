package com.m.i;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.management.RuntimeErrorException;

class Task implements Runnable {
	CyclicBarrier cb;
	String name;
	static int val = 0;

	public Task(CyclicBarrier cb, String name) {
		super();
		this.cb = cb;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("executing the task" + name);
		// val++;
		// System.out.println(val);
		// if (val == 3) {
		// return;
		// }
		// }
		// throw new RuntimeException("throwing exception");
		// }

		try {
			cb.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("+++++++++++++++++++++++++++++++++++executed task"
				+ name);
	}
}

public class CBarrier {
	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
			public void run() {
				System.out.println("reached barrier after 3 threads");
			}
		});
		Thread t1 = new Thread(new Task(cb, "task 1"));
		Thread t2 = new Thread(new Task(cb, "task 2"));
		Thread t3 = new Thread(new Task(cb, "task 3"));
		ExecutorService serv = Executors.newFixedThreadPool(3);
		serv.submit(t1);
		serv.submit(t2);
		serv.submit(t3);
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("am i waiting");
//
//			}
//		}).start();
		 serv.submit(t1);
		 serv.submit(t2);
		cb.reset();
		//serv.submit(t3);
		// serv.submit(t1);
		// serv.submit(t2);
		// serv.submit(t3);
		serv.shutdown();
		/*
		 * t1.start(); t2.start(); t3.start();
		 */
		/*
		 * Thread tn = new Thread( new Runnable() { public void run() {
		 * System.out.println("am i interrupting"); } }); tn.start();
		 */
		// t3.start();

		/*
		 * for (int i = 0; i < 10; i++) { new Thread(new Task( cb, "task " + i )
		 * ).start(); if( i == 4 ) cb.reset(); }
		 */
	}
}
