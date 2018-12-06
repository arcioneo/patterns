package expression;

import java.util.HashMap;

public interface Expression {
	public int interpret(HashMap<String, Integer> variables);
}
