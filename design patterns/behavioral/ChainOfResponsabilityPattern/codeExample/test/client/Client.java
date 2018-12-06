package client;

import org.junit.Before;
import org.junit.Test;

import chain.Bank;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Bank bank = new Bank();

		bank.requestLoan(50_555);

	}

}
