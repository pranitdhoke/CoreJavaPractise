/**
 * 
 */
package org.pranit.java.designpatterns.structural.adapter;

/**
 * @author Pranit Dhoke
 *
 */
public interface SocketAdapter {

	Volt get120Volt();

	Volt get12Volt();

	Volt get3Volt();

}
