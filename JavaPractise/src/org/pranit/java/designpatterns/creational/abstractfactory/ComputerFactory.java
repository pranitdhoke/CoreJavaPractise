package org.pranit.java.designpatterns.creational.abstractfactory;

public class ComputerFactory {

	public static Computer createComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
