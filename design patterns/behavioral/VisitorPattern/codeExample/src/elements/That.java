package elements;

import visitors.Visitor;

public class That implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String that() {
		return "That";
	}

}
