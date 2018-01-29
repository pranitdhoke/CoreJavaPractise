/**
 * 
 */
package org.pranit.java.designpatterns.creational.factory;

/**
 * @author Pranit Dhoke
 *
 */
public class Factory {
	public static Computer getInstance(String type, String hdd, String cpu, String ram) {
		if (type.equals("PC")) {
			return new PC(hdd, cpu, ram);
		} else if (type.equals("Server")) {
			return new Server(hdd, cpu, ram);
		}
		return null;
	}
}
