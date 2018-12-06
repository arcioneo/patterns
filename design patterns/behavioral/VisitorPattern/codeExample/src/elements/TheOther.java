package elements;

import visitors.Visitor;

public class TheOther implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String theOther() {
		return "The Other";
	}

}
