package adapter;

import beans.ElectricEngine;
import beans.Motor;

public class ElectricEngineAdapter extends Motor {

	private ElectricEngine electricEngine;

	public ElectricEngineAdapter() {
		super();
		this.electricEngine = new ElectricEngine();
	}

	@Override
	public void turnOnEngine() {
		this.electricEngine.activate();
		this.electricEngine.connect();
	}

	@Override
	public void turnOffEngine() {
		this.electricEngine.disconnect();
	}

	@Override
	public void speedUp() {
		System.out.println("speeding up electrical motor");
	}
}
