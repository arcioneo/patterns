package beans;

public abstract class Mobile {

	public abstract String getBrand();

	public abstract String getModel();

	@Override
	public String toString() {
		return "Mobile [brand=" + this.getBrand() + ", model=" + this.getModel() + "]";
	}
}
