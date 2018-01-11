package org.pranit.java.basics;

public class CheckForNumbers {
	public static void main(String[] args) {
		String text = "23423442";

		if (text.matches("[0-9]+")) {
			System.out.println("Only numbers");
		} else {
			System.out.println("mixed values");
		}

		System.out.println(Double.parseDouble(text));
		System.out.println(Integer.parseInt(text));

	}

}
