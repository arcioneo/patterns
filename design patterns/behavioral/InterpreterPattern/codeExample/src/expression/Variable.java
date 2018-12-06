package expression;

import java.util.HashMap;

public class Variable implements Expression {

	private String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public int interpret(HashMap<String, Integer> variables) {
		return variables.get(name);
	}

}
