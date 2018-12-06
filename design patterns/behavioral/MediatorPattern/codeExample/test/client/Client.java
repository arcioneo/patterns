package client;

import org.junit.Before;
import org.junit.Test;

import colleages.ConcreteColleague;
import colleages.MobileColleague;
import mediators.ApplicationMediator;
import mediators.Mediator;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Mediator mediator = new ApplicationMediator();
		ConcreteColleague desktop = new ConcreteColleague(mediator);
		MobileColleague mobile = new MobileColleague(mediator);
		mediator.addColleague(desktop);
		mediator.addColleague(mobile);

		mediator.send("Buenas desktop", desktop);
		mediator.send("Buenas mobile", mobile);
	}

}
