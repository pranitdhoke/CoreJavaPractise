/**
 * 
 */
package org.pranit.java.designpatterns.structural.adapter;

/**
 * @author Pranit Dhoke
 *
 */
public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}
}
