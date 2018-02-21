/**
 * 
 */
package org.pranit.java.designpatterns.behavioral;

/**
 * @author Pranit Dhoke
 *
 */
public class SMSNotification extends Notification {

	/* (non-Javadoc)
	 * @see org.pranit.java.designpatterns.behavioral.Notification#SendNotification()
	 */
	@Override
	public void sendNotification() {
		String msg = getMessage();
		System.out.println("Notification sent via SMS:" + msg);
	}

}
