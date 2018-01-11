package a.com;

import java.util.concurrent.*;
import java.util.*;
import java.text.*;

public class SemaphoreTest {
	private static final int MAX_THREADS = 5;

	public static void main(String[] args) throws Exception {
		Semaphore semaphore = new Semaphore(0);
		System.out.println("Spawning Threads");
		int threadCount = 0;
		Random random = new Random();
		for (int i = 0; i < MAX_THREADS; i++) {
			// Threads created will not always be MAX_THREADS
			// Because Threads are created only if Random no is Even.
			// Thus the No of Threads unknown at Semaphore Initialization
			if (random.nextInt(9999) % 2 == 0) {
				// Thread t = new Thread(new
				// WorkerThread(semaphore,String.format("Thread-%d", i)));
				// System.out.println("Value of i = "+i);
				Thread t = new Thread(
						new WorkerThread(semaphore, "Thread-" + i), "Thread-"
								+ i);
				t.start();
				threadCount++;
				System.out.println("threadCount " + threadCount);
			}
		}

		//semaphore.acquire();
		 semaphore.acquire(threadCount);
		// new Thread(new WorkerThread(semaphore, "Thread-" + 6), "Thread-" + 6)
		// .start();
		// new Thread(new WorkerThread(semaphore, "Thread-" + 7), "Thread-" + 7)
		// .start();
		System.out.println("Spawning Finished");
		System.out.println("Waiting All Threads to Finish");

		System.out.println("All Threads are Finished");
	}

	private static class WorkerThread implements Runnable {
		private Semaphore semaphore;
		int count = 0;

		private String name;

		public WorkerThread(Semaphore semaphore, String name) {
			this.name = name;
			this.semaphore = semaphore;
		}

		public WorkerThread(String name) {
			this.name = name;

		}

		public void run() {
			try {
				count++;
				SimpleDateFormat sdf = new SimpleDateFormat(
						"dd/MM/yyyy HH:mm:ss");
				System.out.printf("%s : Doing Some Work on %s\n",
						getFormattedDate(sdf), name);
				Thread.sleep(getRandomWaitTime());
				System.out.printf("%s : Doing Some more work on %s\n",
						getFormattedDate(sdf), name);
				Thread.sleep(getRandomWaitTime());
				System.out.printf("%s : Finished work on %s\n",
						getFormattedDate(sdf), name);
				/*
				 * if ("Thread-0".equalsIgnoreCase(Thread.currentThread()
				 * .getName())) { System.out.println("Not  Release 1st Thread");
				 * System.out.println(Thread.currentThread().getName()); } else
				 * {
				 */
				// if (count != 2) {
				// semaphore.release();
				// }
				semaphore.release();
				System.out.printf("%s : Released %s\n", getFormattedDate(sdf),
						name);
				System.out.println(Thread.currentThread().getName() + ""
						+ "no permits" + semaphore.availablePermits());
				// }

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private String getFormattedDate(SimpleDateFormat sdf) {
			return sdf.format(new Date());
		}

		private int getRandomWaitTime() {
			return (int) ((Math.random() + 1) * 1000);
		}

	}
}