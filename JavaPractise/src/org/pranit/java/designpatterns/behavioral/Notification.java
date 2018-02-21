/**
 * 
 */
package org.pranit.java.designpatterns.behavioral;

/**
 * @author Pranit Dhoke
 *
 */
public abstract class Notification {
	public abstract void sendNotification();

	public String getMessage() {
		return "This is a sample message..";
	}

}
