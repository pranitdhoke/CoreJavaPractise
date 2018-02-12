package org.pranit.java.designpatterns.creational.builder;

import org.pranit.java.designpatterns.creational.builder.Computer.ComputerBuilder;

public class BuilderDemo {
	public static void main(String[] args) {
		Computer desktop = new Computer.ComputerBuilder("1TB", "4GB").setGraphicsCardEnabled(false)
				.setBluetoothEnabled(true).build();
		
		System.out.println("Desktop is: "+ desktop);
		
		Computer server = new Computer.ComputerBuilder("100TB", "400GB").setGraphicsCardEnabled(true)
				.setBluetoothEnabled(false).build();
		
		System.out.println("Server is: "+ server);

	}
}
