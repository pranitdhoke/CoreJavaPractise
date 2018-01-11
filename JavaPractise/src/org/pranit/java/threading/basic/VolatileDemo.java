/**
 * 
 */
package org.pranit.java.threading.basic;

/**
 * @author Pranit Dhoke
 *
 */
public class VolatileDemo {

	public static void main(String[] args) {
		Worker worker = new Worker();
		Thread t = new Thread(worker);
		t.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		worker.setTerminated(true);

		System.out.println("Finished the job......");

	}

}

class Worker implements Runnable {

	/**
	 * If volatile is not used then there can be a chance that different threads
	 * read the value form the cache and data becomes dirty causing issue in
	 * application.
	 */
	private boolean isTerminated = false;

	/**
	 * If volatile is used then the isTerminated value is read form the main memory
	 * and not from the cache.
	 */
	// private volatile boolean isTerminated = false;

	@Override
	public void run() {
		while (!isTerminated) {
			System.out.println("Hello form worker class......");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean isTerminated() {
		return isTerminated;
	}

	public void setTerminated(boolean isTerminated) {
		this.isTerminated = isTerminated;
	}

}