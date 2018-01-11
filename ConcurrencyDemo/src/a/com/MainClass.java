package a.com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

class A1 {
	int z;

	public void before() {
		System.out.println("before");
	}

	public void div(int x, int y, int v) {
		try {
			z = x / y;
			int[] arr = new int[5];

			arr[v] = 33;
			return;

		} catch (ArithmeticException ae) {
			// TODO: handle exception
			ae.printStackTrace();
			// throw new ArithmeticException("gooooo");
		} catch (ArrayIndexOutOfBoundsException ae) {
			// TODO: handle exception
			ae.printStackTrace();
		} catch (Exception ae) {
			// TODO: handle exception
			ae.printStackTrace();
		} finally {
			System.out.println("finally 11111");
		}
		System.out.println("is this finally");
	}

	public void after() {
		System.out.println("after");
	}
}

class A2 extends A1 {
	public void callit(int x, int y, int v) throws Exception {
		try {
			div(x, y, v);
		} finally {
			System.out.println("finally 222222");
		}
	}
}

class A {
	static int val1;
	static {
		System.out.println("A static");
	}

	public A() {
		System.out.println("A constructor");
	}
}

class B extends A {
	static int val2;
	static {
		val1 = 99;
		val2 = 199;
		System.out.println("B static");
	}

	public B() {
		System.out.println("B constructor");
	}
}

public class MainClass {
	public static void main(String[] args) throws Exception {
		System.out.println(B.val2);
		 ArrayList<String> list = new ArrayList<String>(Integer.MAX_VALUE);
		 ArrayBlockingQueue<String> q = new ArrayBlockingQueue<String>(
		 Integer.MAX_VALUE);
		 A2 obj = new A2();
		 //Scanner sc = new Scanner(System.in);
		 //int val = sc.nextInt();
		 obj.before();
		 obj.callit(5, 0,4);
		 obj.after();
	}
}
