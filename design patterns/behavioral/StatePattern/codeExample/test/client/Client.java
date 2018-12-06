package client;

import org.junit.Before;
import org.junit.Test;

import contexts.Context;
import states.State;
import states.TVStartState;
import states.TVStopState;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Context context = new Context();

		State on = new TVStartState();
		context.setState(on);
		context.doAction();

		State off = new TVStopState();

		context.setState(off);
		context.doAction();

	}

}
