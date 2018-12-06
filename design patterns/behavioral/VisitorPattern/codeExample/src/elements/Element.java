package elements;

import visitors.Visitor;

public interface Element {
	public void accept(Visitor v);
}
