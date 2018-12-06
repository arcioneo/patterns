package decorators;

import components.Combo;

public class Queso extends Aditionals {

	Combo combo;

	public Queso(Combo combo) {
		super();
		this.combo = combo;
	}

	@Override
	public String getDescription() {
		return combo.getDescription() + " extra queso";
	}

	@Override
	public int getValue() {
		return combo.getValue() + 10;
	}

}
