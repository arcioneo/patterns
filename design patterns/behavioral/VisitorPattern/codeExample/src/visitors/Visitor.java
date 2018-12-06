package visitors;

import elements.That;
import elements.TheOther;
import elements.This;

public interface Visitor {

	public void visit(This e);

	public void visit(That e);

	public void visit(TheOther e);

}
