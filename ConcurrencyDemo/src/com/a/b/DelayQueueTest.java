package com.a.b;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueTest {
	public static void main(String... args) throws InterruptedException {
		BlockingQueue dq = new DelayQueue();
		DeleyedTest ob1 = new DeleyedTest(10000, "2");
		DeleyedTest ob2 = new DeleyedTest(20000, "3");
		DeleyedTest ob3 = new DeleyedTest(100000, "1");
		dq.offer(ob1);
		System.out.println("obj 1 offer");
		dq.offer(ob2);
		System.out.println("obj 2 offer");
		dq.offer(ob3);
		System.out.println("obj 3 offer");
		/*
		 * Iterator itr = dq.iterator(); while (itr.hasNext()) { DeleyedTest dt
		 * = (DeleyedTest) itr.next(); System.out.println(dt.deleyTime); }
		 */
		DeleyedTest d1;
		for (int i = 1; i <= 3; i++) {
			System.out.println("before");
			// System.out.println(dq.take() );
			// System.out.println((dq.take()).toString() );
			d1 = (DeleyedTest) dq.take();
			System.out.println(d1.toString());
			System.out.println("after");
			d1 = null;
		}
		System.out.println("main over");
	}
}

class DeleyedTest implements Delayed {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long deleyTime = 0;
	long time = System.currentTimeMillis();

	DeleyedTest(long deleyTime, String name) {
		this.deleyTime = deleyTime;
		this.name = name;
	}

	@Override
	public int compareTo(Delayed ob) {
		if (this.deleyTime < ((DeleyedTest) ob).deleyTime) {
			return -1;
		} else if (this.deleyTime > ((DeleyedTest) ob).deleyTime) {
			return 1;
		}
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long val = unit.convert(
				deleyTime - (System.currentTimeMillis() - time),
				TimeUnit.MILLISECONDS);
		System.out.println("val " + val + "  " + name);
		return val;
	}

	@Override
	public String toString() {
		return "DeleyedTest [name=" + name + "]";
	}

}
