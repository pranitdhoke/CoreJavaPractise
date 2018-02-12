/**
 * 
 */
package org.pranit.java.designpatterns.creational.abstractfactory;

/**
 * @author Pranit Dhoke
 *
 */
public class PC extends Computer {
	private String hdd;
	private String ram;
	private String cpu;

	public PC(String hdd, String cpu, String ram) {
		this.hdd = hdd;
		this.cpu = cpu;
		this.ram = ram;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.creational.factory.Computer#getHDD()
	 */
	@Override
	public String getHDD() {
		return this.hdd;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.creational.factory.Computer#getCPU()
	 */
	@Override
	public String getCPU() {
		return this.cpu;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.creational.factory.Computer#getRam()
	 */
	@Override
	public String getRam() {
		return this.ram;
	}

}
