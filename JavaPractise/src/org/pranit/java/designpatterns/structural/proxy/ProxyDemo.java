/**
 * 
 */
package org.pranit.java.designpatterns.structural.proxy;

/**
 * @author pdhoke
 *
 */
public class ProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("root", "abcd");
		try {
			executor.executeCommand("cmd.exe /c dir");
			executor.executeCommand("cmd.exe /c del JavaPracitise\\abc.txt");
		} catch (Exception e) {
			System.out.println("Exception message: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
