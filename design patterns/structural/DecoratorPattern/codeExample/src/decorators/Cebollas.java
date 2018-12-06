package decorators;

import components.Combo;

public class Cebollas extends Aditionals {

	Combo combo;

	public Cebollas(Combo combo) {
		super();
		this.combo = combo;
	}

	@Override
	public String getDescription() {
		return combo.getDescription() + " con cebollas";
	}

	@Override
	public int getValue() {
		return combo.getValue() + 5;
	}

}
