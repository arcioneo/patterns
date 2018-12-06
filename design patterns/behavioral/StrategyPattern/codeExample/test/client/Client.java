package client;

import org.junit.Before;
import org.junit.Test;

import contexts.Context;
import strategies.OperationAdd;
import strategies.OperationMultiply;
import strategies.OperationSubstract;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
