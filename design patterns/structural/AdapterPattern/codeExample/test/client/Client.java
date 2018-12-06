package client;

import org.junit.Before;
import org.junit.Test;

import adapter.ElectricEngineAdapter;
import beans.ClassicEngine;
import beans.EconomicEngine;
import beans.Motor;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Motor classic = new ClassicEngine();
		Motor economic = new EconomicEngine();
		Motor electric = new ElectricEngineAdapter();

		classic.turnOnEngine();
		economic.turnOnEngine();
		electric.turnOnEngine();

	}

}
