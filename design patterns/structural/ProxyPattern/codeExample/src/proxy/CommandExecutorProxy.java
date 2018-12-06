package proxy;

import executor.CommandExecutor;
import executor.CommandExecutorImpl;

public class CommandExecutorProxy implements CommandExecutor {
	private boolean			isAdmin;
	private CommandExecutor	executor;

	public CommandExecutorProxy(String user, String password) {
		super();
		isAdmin = "root".equals(user) && "root".equals(password);
		executor = new CommandExecutorImpl();
	}

	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			throw new Exception("Unauthorized user");
		}
	}

}
