package org.pranit.java.designpatterns.creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

	private String hdd;
	private String ram;
	private String cpu;

	public ServerFactory(String hdd, String ram, String cpu) {
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(hdd, cpu, ram);	
	}

}
