package executor;

public class CommandExecutorImpl implements CommandExecutor {

	public void runCommand(String cmd) throws Exception {
		System.out.println("Running " + cmd + " command");
	}

}
