package receiver;

public class Light {
	private boolean on;

	public void switchOn() {
		System.out.println("Turning lights on");
		on = true;
	}

	public void switchOff() {
		System.out.println("Turning lights off");
		on = false;
	}
}
