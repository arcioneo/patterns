package client;

import org.junit.Before;
import org.junit.Test;

import templates.GlassHouse;
import templates.HouseTemplate;
import templates.WoodenHouse;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		HouseTemplate houseType = new WoodenHouse();

		houseType.buildHouse();

		houseType = new GlassHouse();

		houseType.buildHouse();
	}

}
