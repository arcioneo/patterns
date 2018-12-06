package client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import executor.CommandExecutor;
import proxy.CommandExecutorProxy;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_whenAuthorized_shouldRunTheCommand() {
		CommandExecutor proxy = new CommandExecutorProxy("root", "root");

		try {
			proxy.runCommand("delete");
		} catch (Exception e) {
			fail("Exception should not be thrown");
		}

	}

	@Test
	public void test_whenNotAuthorized_shouldThrowException() {
		CommandExecutor proxy = new CommandExecutorProxy("", "");

		try {
			proxy.runCommand("delete");
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Unauthorized user");
		}

	}

}
