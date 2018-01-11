package a.com;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	CyclicBarrier cb;
	String name;
	static volatile int count = 0;

	public Task(CyclicBarrier cb, String name) {
		super();
		this.cb = cb;
		this.name = name;
	}

	@Override
	public void run() {
		count++;
		System.out.println(count + "countvalue executing the task" + name);
		try {
			// if (count == 2) {
			// throw new ArithmeticException();
			// }
			cb.await();
			for (int i = 0; i < 1; i++)
				System.out.println("After await");
			// write to file
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("executed task " + count);
	}

}

public class CBarrier {
	public static void main(String[] args) {
		final CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++)
					System.out.println("After barrier i am executing");
			}
		});
		Thread t1 = new Thread(new Task(cb, "task 1"));
		Thread t2 = new Thread(new Task(cb, "task 2"));
		Thread t3 = new Thread(new Task(cb, "task 3"));
		ExecutorService serv = Executors.newFixedThreadPool(3);
		serv.submit(t1);
		serv.submit(t2);
		serv.submit(t3);
		// serv.submit(t1);
		// serv.submit(t2);
		// serv.submit(t3);
		// serv.submit(t1);
		// serv.submit(t2);
		// serv.submit(t3);
		serv.shutdown();
		// t1.start();
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// t2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
		// {
		//
		// @Override
		// public void uncaughtException(Thread t, Throwable e) {
		// System.out.println("before reset");
		// cb.reset();
		// System.out.println("after reset");
		//
		// }
		// });
		// t2.start();
		// t3.start();
		// t1.start();
		// new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// for (int i = 0; i < 10; i++)
		// System.out.println("am i executing");
		//
		// }
		// }).start();
		//
		// Thread tn = new Thread(new Runnable() {
		// public void run() {
		// System.out.println("am i interrupting");
		// }
		// });
		// tn.start();
		//
		// t3.start();

		// for (int i = 0; i < 10; i++) {
		// new Thread(new Task(cb, "task " + i)).start();
		// if (i == ) {
		// throw new ArithmeticException("Exception thrown");
		// // System.out.println("bf reset");
		// // cb.reset();
		// // System.out.println("af reset");
		// }
		// }

	}
}
