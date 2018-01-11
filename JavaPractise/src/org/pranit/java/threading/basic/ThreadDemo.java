package org.pranit.java.threading.basic;

class Runner1 extends Thread{
	@Override
	public void run() {
		for(int i=0 ;i<10 ; i++) {
			System.out.println("*Runner 1 = " + i);
		}
	}
}

class Runner2 extends Thread{
	@Override
	public void run() {
		for(int i=0 ;i<10 ; i++) {
			System.out.println("***Runner 2 = " + i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Runner1 runner1 =new Runner1();
		Runner2 runner2 =new Runner2();
		runner1.start();
		runner2.start();
	}

}
