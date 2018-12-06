package beans;

public class EconomicEngine extends Motor {
	@Override
	public void turnOnEngine() {
		System.out.println("turn on economic engine");
	}

	@Override
	public void turnOffEngine() {
		System.out.println("turn off economic engine");
	}

	@Override
	public void speedUp() {
		System.out.println("speed up economic engine");
	}
}
