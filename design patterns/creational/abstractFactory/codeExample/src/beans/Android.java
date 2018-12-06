package beans;

public class Android extends Mobile {

	private String	brand;
	private String	model;

	public Android(String brand, String model) {
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
