package factory;

import beans.Android;
import beans.Mobile;
import interfaces.MobileAbstractFactory;

public class AndroidFactory implements MobileAbstractFactory {

	private String	brand;
	private String	model;

	public AndroidFactory(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	@Override
	public Mobile createMobile() {
		return new Android(brand, model);
	}

}
