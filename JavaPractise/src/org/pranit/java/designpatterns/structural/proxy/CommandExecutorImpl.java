/**
 * 
 */
package org.pranit.java.designpatterns.structural.proxy;

/**
 * @author pdhoke
 *
 */
public class CommandExecutorImpl implements CommandExecutor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.structural.proxy.CommandExecutor#
	 * executeCommand(java.lang.String)
	 */
	@Override
	public void executeCommand(String cmd) throws Exception {

		Process process = Runtime.getRuntime().exec(cmd);
		System.out.println(process);
		System.out.println("' " + cmd + " ' executed");
	}

}
