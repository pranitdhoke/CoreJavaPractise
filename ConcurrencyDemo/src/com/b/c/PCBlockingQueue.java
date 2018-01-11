package com.b.c;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class PCBlockingQueue {

	// BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);

	// LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>(
	// Integer.MAX_VALUE);

	SynchronousQueue<String> queue = new SynchronousQueue<String>();

	public static void main(String[] args) {
		final PCBlockingQueue pcb = new PCBlockingQueue();
		class Prod implements Runnable {
			public void run() {
				for (int i = 1; i <= 100; i++) {

					try {
						// System.out.println("produced");
						pcb.queue.put("" + i);
						System.out.println("produced" + i);

						// System.out.println("produced " + i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// try {
					// pcb.queue.put("" + i);
					// // Thread.sleep(500);
					// if (i == 10)
					// pcb.queue.put("end");
					// } catch (InterruptedException e) {
					// // TODO Auto-generated catch block
					// e.printStackTrace();
					// }
				}
			}
		}
		class Cons implements Runnable {
			public void run() {
				for (int i = 1; i <= 100; i++) {

					try {
						System.out.println("consumed" + pcb.queue.take());

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				// try {
				// while (true) {
				// String val = pcb.queue.take();
				// if ("end".equals(val))
				// break;
				// System.out.println(val);
				// }
				// } catch (InterruptedException e) {
				// // TODO Auto-generated catch block
				// e.printStackTrace();
				// }
			}
		}
		ExecutorService ser = Executors.newCachedThreadPool();
		ser.execute(new Prod());
		// ser.execute(new Cons());
		// ser.shutdown();
		// ser.shutdownNow();
	}
}
