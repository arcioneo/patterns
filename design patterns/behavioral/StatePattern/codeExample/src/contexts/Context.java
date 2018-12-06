package contexts;

import states.State;

public class Context {
	State state;

	public Context() {
		super();
	}

	public void doAction() {
		this.state.doAction();
	}

	public void setState(State state) {
		this.state = state;
	}

}
