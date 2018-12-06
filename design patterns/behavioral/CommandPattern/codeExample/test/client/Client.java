package client;

import org.junit.Before;
import org.junit.Test;

import commands.Command;
import commands.LightOffCommand;
import commands.LightOnCommand;
import invoker.RemoteControl;
import receiver.Light;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);
		// switch on
		control.setCommand(lightsOn);
		control.pressButton();
		// switch off
		control.setCommand(lightsOff);
		control.pressButton();
	}

}
