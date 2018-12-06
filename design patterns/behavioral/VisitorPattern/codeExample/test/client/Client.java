package client;

import org.junit.Before;
import org.junit.Test;

import elements.Element;
import elements.That;
import elements.TheOther;
import elements.This;
import visitors.DownVisitor;
import visitors.UpVisitor;
import visitors.Visitor;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Element[] elements = { new This(), new That(), new TheOther() };

		Visitor up = new UpVisitor();
		Visitor down = new DownVisitor();

		for (int i = 0; i < elements.length; i++) {
			elements[i].accept(up);
		}
		for (int i = 0; i < elements.length; i++) {
			elements[i].accept(down);
		}
	}

}
