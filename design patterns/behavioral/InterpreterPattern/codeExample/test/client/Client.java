package client;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import parser.Evaluator;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String expression = "w x z - +";
		Evaluator sentence = new Evaluator(expression);
		HashMap<String, Integer> variables = new HashMap<String, Integer>();
		variables.put("w", 5);
		variables.put("x", 10);
		variables.put("z", 42);
		int result = sentence.evaluate(variables);
		System.out.println(result);
	}

}
