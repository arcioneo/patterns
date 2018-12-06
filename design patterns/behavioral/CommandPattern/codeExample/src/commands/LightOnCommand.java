package commands;

import receiver.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOn();
	}

}
