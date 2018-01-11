package com.b.c;

class Common {
	public static int val;

	public synchronized void produce() {
		System.out.println("before notify");
		// 1st signal leak
		notify();
		System.out.println("after notify");
		System.out.println("produced " + ++val);
		System.out.println("before wait");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after wait");
		// try {
		// if (val != 10)

		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

	public synchronized void consume() {
		System.out.println("c before notify");
		notify();
//		for (int i = 0; i < 1000; i++) {
//
//		}
		System.out.println("c after notify");
		System.out.println("consumed " + val);
		System.out.println("c before wait");
		try {
//			if (val != 10)
				wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("c after wait");
	}
}

class Producer implements Runnable {
	Common object;

	public Producer(Common object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			object.produce();
		}

	}
}

class Consumer implements Runnable {
	Common object;

	public Consumer(Common object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			object.consume();
		}

	}
}

public class PCSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Common object = new Common();
		Producer pr = new Producer(object);
		Consumer cr = new Consumer(object);
		Thread t1 = new Thread(pr);
		Thread t2 = new Thread(cr);
		t1.start();
		t2.start();
		while (true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t1" + t1.getState());
			System.out.println("t2" + t2.getState());
		}

	}

}
