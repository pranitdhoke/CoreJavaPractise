package org.pranit.java.basics;

/**
 * 
 * @author Pranit Dhoke
 *
 */
public class ShiftOperatorDemo {

	public static void main(String[] args) {

		int a = -2;
		ShiftOperatorDemo shiftOperator = new ShiftOperatorDemo();
		shiftOperator.leftShfit(a);
		System.out.println("***********************");
		shiftOperator.rightShfit(a);
		System.out.println("***********************");
		shiftOperator.unsignedRightShfit(a);
	}

	/**
	 * Method demonstrates the functioning of Unsigned right shift,
	 * 
	 * @param a
	 */
	private void unsignedRightShfit(int a) {
		System.out.println("********Unsigned Right shift operation. ********");
		System.out.println("Value of a is = " + a);
		System.out.println("Binary representation of \"a\" is = " + Integer.toBinaryString(a));
		a = a >>> 1;
		System.out.println("Value of a is = " + a);
		System.out.println("Binary representation of \"a\" is = " + Integer.toBinaryString(a));
	}

	/**
	 * Method demonstrates the functioning of left shift,
	 * 
	 * @param a
	 */
	private void leftShfit(int a) {
		System.out.println("********Left shift operation. ********");
		System.out.println("Value of a is = " + a);
		System.out.println("Binary representation of \"a\" is = " + Integer.toBinaryString(a));
		a = a << 1;
		System.out.println("Value of a is = " + a);
		System.out.println("Binary representation of \"a\" is = " + Integer.toBinaryString(a));
	}

	/**
	 * Method demonstrates the functioning of right shift,
	 * 
	 * @param a
	 */
	private void rightShfit(int a) {
		System.out.println("******** Right shift operation. ********");
		System.out.println("Value of a is = " + a);
		System.out.println("Binary representation of \"a\" is = " + Integer.toBinaryString(a));
		a = a >> 1;
		System.out.println("Value of a is = " + a);
		System.out.println("Binary representation of \"a\" is = " + Integer.toBinaryString(a));
	}

}
