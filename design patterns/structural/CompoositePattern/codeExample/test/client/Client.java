package client;

import org.junit.Before;
import org.junit.Test;

import components.base.Employee;
import leaf.Developer;
import leaf.Manager;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Employee manager = new Manager("Mr Manager", "A lot of money");
		Employee developerSr = new Developer("Sr Dev", "Some money");
		Employee developerJr = new Developer("Jr Dev", "Little money");
		Employee programmer = new Developer("Mr programmer", "Free!");

		manager.add(developerSr);
		manager.add(developerJr);
		manager.add(programmer);

		manager.print();
	}

}
