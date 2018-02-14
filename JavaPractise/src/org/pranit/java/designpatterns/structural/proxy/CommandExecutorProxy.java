/**
 * 
 */
package org.pranit.java.designpatterns.structural.proxy;

/**
 * @author pdhoke
 *
 */
public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String user, String password) {
		if ("root".equals(user) && "abcd".equals(password)) {
			isAdmin = Boolean.TRUE;
		}
		executor = new CommandExecutorImpl();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pranit.java.designpatterns.structural.proxy.CommandExecutor#
	 * executeCommand(java.lang.String)
	 */
	@Override
	public void executeCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.executeCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm") || cmd.trim().contains("del")) {
				throw new Exception("rm/del command not allowed for non-admin user.");
			} else {
				executor.executeCommand(cmd);
			}
		}

	}

}
