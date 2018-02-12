/**
 * 
 */
package org.pranit.java.designpatterns.creational.abstractfactory;

/**
 * @author Pranit Dhoke
 *
 */
public class PCFactory implements ComputerAbstractFactory {

	private String hdd;
	private String cpu;
	private String ram;

	public PCFactory(String hdd, String cpu, String ram) {
		this.hdd = hdd;
		this.cpu = cpu;
		this.ram = ram;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.creational.abstractfactory.
	 * ComputerAbstractFactory#createComputer()
	 */
	@Override
	public Computer createComputer() {
		return new PC(hdd, cpu, ram);
	}

}
