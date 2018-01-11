package com.b.c;

class ChangeVal {
	public static int val;

	public void incVal() {

		System.out.println("inc" + ++val);
	}

	public void decVal() {

		System.out.println("dec" + --val);
	}

}

class Inc implements Runnable {
	ChangeVal object;

	public Inc(ChangeVal object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {

		object.incVal();

	}

}

class Dec implements Runnable {
	ChangeVal object;

	public Dec(ChangeVal object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		object.decVal();

	}

}

class In {
	public int val;

	public void inc() {
		val++;
	}
}

class Ch implements Runnable {
	static int val = 0;

	@Override
	public void run() {
		if (Thread.currentThread().getName() == "first") {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(++val);
	}
}

public class WhySynchronize {

	public static void main(String[] args) throws InterruptedException {
		// ChangeVal object = new ChangeVal();
		// Inc task1 = new Inc(object);
		// Dec task2 = new Dec(object);
		Ch object = new Ch();
		Thread t1 = new Thread(object, "first");
		Thread t2 = new Thread(object);
		Thread t3 = new Thread(object);
		Thread t4 = new Thread(object);
		t1.start();
		// Thread.sleep(1000);
		t2.start();
		t3.start();
		t4.start();
	}
}
