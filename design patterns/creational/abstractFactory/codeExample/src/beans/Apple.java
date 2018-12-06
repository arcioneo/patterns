package beans;

public class Apple extends Mobile {

	private String	brand;
	private String	model;

	public Apple(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String getModel() {
		return model;
	}

}
