/**
 * 
 */
package org.pranit.java.designpatterns.creational.factory;

/**
 * @author Pranit Dhoke
 *
 */
public abstract class Computer {

	public abstract String getHDD();

	public abstract String getCPU();

	public abstract String getRam();

	@Override
	public String toString() {
		return "Computer [getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + ", getRam()=" + getRam() + "]";
	}

}
