package com.a.b;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

class DoTask {
	LinkedBlockingDeque<Integer> queue;

	public DoTask(LinkedBlockingDeque<Integer> queue) {
		super();
		this.queue = queue;
	}

	public void produce() {
		for (int i = 0; i < 10; i++) {
			// if (i == 3)
			// try {
			// Thread.sleep(5000);
			// } catch (InterruptedException e1) {
			// // TODO Auto-generated catch block
			// e1.printStackTrace();
			// }
			try {
				// System.out.println("put" + i);
				queue.put(i);
				System.out.println("put" + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void consume() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < 10; i++)
			try {
				if (i % 2 == 0)
					System.out.println(queue.takeFirst());
				else
					System.out.println(queue.takeLast());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}

class PutTask implements Runnable {
	DoTask dt;

	public PutTask(DoTask dt) {
		super();
		this.dt = dt;
	}

	@Override
	public void run() {
		dt.produce();
	}

}

class TakeTask implements Runnable {
	DoTask dt;

	public TakeTask(DoTask dt) {
		super();
		this.dt = dt;
	}

	@Override
	public void run() {
		dt.consume();
	}

}

public class MainClass {

	public static void main(String[] args) {
		// ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(
		// Integer.MAX_VALUE);
		LinkedBlockingDeque<Integer> queue = new LinkedBlockingDeque<Integer>(
				10);
		DoTask dt = new DoTask(queue);
		PutTask task1 = new PutTask(dt);
		TakeTask task2 = new TakeTask(dt);
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		// while (true) {
		// try {
		// Thread.sleep(50);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.println(t1.getState());
		// System.out.println(t2.getState());
		// }
	}

}
