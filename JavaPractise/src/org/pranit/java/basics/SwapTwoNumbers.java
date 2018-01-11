package org.pranit.java.basics;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Integer a =-1;
		Integer b =-7;
		swap1(a,b);
		swap2(a,b);
	}

	private static void swap2(Integer a, Integer b) {
		System.out.println("a = " + a +" ---- b = "+ b);
		a = a*b;
		b = a/b;
		a =	a/b;
		System.out.println("a = " + a +" ---- b = "+ b);
	}

	private static void swap1(Integer a, Integer b) {
		System.out.println("a = " + a +" ---- b = "+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a +" ---- b = "+ b);
	}

}
