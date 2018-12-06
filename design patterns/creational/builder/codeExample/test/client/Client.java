package client;

import org.junit.Before;
import org.junit.Test;

import bean.User;
import bean.UserBuilder;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		User user = new UserBuilder().name("Eduardo").lastName("Milpas").email("eduardomilpas@gmail.com").build();
		System.out.println(user);
	}

}
