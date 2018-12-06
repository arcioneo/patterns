package client;

import org.junit.Before;
import org.junit.Test;

import observers.BinaryObserver;
import observers.HexObserver;
import observers.OctObserver;
import subjects.Subject;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Subject sub = new Subject();

		new HexObserver(sub);
		new OctObserver(sub);
		new BinaryObserver(sub);

		sub.setState(12);

	}

}
