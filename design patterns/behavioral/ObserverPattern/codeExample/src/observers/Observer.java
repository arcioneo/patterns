package observers;

import subjects.Subject;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
