package client;

import org.junit.Before;
import org.junit.Test;

import facade.ReservationFacade;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ReservationFacade facade = new ReservationFacade();

		facade.reserveRoom();
	}

}
