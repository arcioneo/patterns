package expression;

import java.util.HashMap;

public class Number implements Expression {

	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public int interpret(HashMap<String, Integer> variables) {
		return number;
	}

}
