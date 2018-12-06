package client;

import org.junit.Before;
import org.junit.Test;

import roles.Caretaker;
import roles.Originator;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Caretaker caretaker = new Caretaker();

		Originator originator = new Originator();
		originator.set("State1");
		originator.set("State2");
		caretaker.addMemento(originator.saveToMemento());
		originator.set("State3");
		caretaker.addMemento(originator.saveToMemento());
		originator.set("State4");

		originator.restoreFromMemento(caretaker.getMemento(0));
	}

}
