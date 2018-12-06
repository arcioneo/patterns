package expression;

import java.util.HashMap;

public class Minus implements Expression {

	Expression	leftOperand;
	Expression	rightOperand;

	public Minus(Expression left, Expression right) {
		leftOperand = left;
		rightOperand = right;
	}

	@Override
	public int interpret(HashMap<String, Integer> variables) {
		return leftOperand.interpret(variables) - rightOperand.interpret(variables);
	}

}
