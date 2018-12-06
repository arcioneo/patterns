package client;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import beans.MacBook;
import factory.MacBookFactory;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		MacBook macBookAir1 = MacBookFactory.createMacBookAir("1", 8, 500);
		MacBook macBookAir2 = MacBookFactory.createMacBookAir("2", 16, 500);
		MacBook macBookAir3 = MacBookFactory.createMacBookAir("3", 16, 500);
		MacBook macBookAir4 = MacBookFactory.createMacBookAir("4", 8, 500);

		assertEquals(MacBookFactory.getCreatedMacs(), 2);

	}

}
