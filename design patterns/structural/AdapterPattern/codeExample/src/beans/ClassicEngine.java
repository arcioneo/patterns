package beans;

public class ClassicEngine extends Motor {

	@Override
	public void turnOnEngine() {
		System.out.println("turn on classic engine");
	}

	@Override
	public void turnOffEngine() {
		System.out.println("turn off classic engine");
	}

	@Override
	public void speedUp() {
		System.out.println("speed up classic engine");
	}

}
