package factory;

import beans.Apple;
import beans.Mobile;
import interfaces.MobileAbstractFactory;

public class AppleFactory implements MobileAbstractFactory {

	private String	brand;
	private String	model;

	public AppleFactory(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	@Override
	public Mobile createMobile() {
		return new Apple(brand, model);
	}
}
