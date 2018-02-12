package org.pranit.java.designpatterns.creational.abstractfactory;

public class TestAbstractFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.createComputer(new PCFactory("1TB", "4 cores", "8 GB"));
		Computer server = ComputerFactory.createComputer(new ServerFactory("100TB", "34 cores", "24 GB"));

		System.out.println("Configuration for non admin user:"+pc);
		System.out.println("Configuration for server user:"+server);
	}

}
