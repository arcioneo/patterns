package client;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import beans.Person;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Person brother = new Person("Eduardo", "Milpas", "brother", "eduardomilpas@gmail.com");
		Person sister = (Person) brother.clone();

		sister.setEmail("sis@gmail.com");

		assertEquals(brother.getName(), sister.getName());
	}

}
