/**
 * 
 */
package org.pranit.java.designpatterns.behavioral;

/**
 * @author Pranit Dhoke
 *
 */
public class TemplateMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Notification notification = new SMSNotification();
		notification.sendNotification();
		System.out.println("\n********************************\n");
		notification = new EmailNotification();
		notification.sendNotification();
		

	}

}
