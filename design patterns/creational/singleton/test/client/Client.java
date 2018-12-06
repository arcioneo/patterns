package client;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import beans.ClasicSingleton;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ClasicSingleton singleton1 = ClasicSingleton.getInstance();
		ClasicSingleton singleton2 = ClasicSingleton.getInstance();
		ClasicSingleton singleton3 = ClasicSingleton.getInstance();
		ClasicSingleton singleton4 = ClasicSingleton.getInstance();

		assertTrue(singleton1 == singleton2);
		assertTrue(singleton1 == singleton3);
		assertTrue(singleton1 == singleton4);

	}

}
