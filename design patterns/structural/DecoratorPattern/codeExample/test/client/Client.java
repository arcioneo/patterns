package client;

import org.junit.Before;
import org.junit.Test;

import components.BasicCombo;
import components.Combo;
import decorators.Cebollas;
import decorators.Queso;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Combo basicCombo = new BasicCombo();
		Combo queso = new Queso(basicCombo);
		Combo cebollas = new Cebollas(queso);

		System.out.println("Tu orden es " + cebollas.getDescription());
		System.out.println("Total: " + cebollas.getValue());

	}

}
