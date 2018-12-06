package observers;

import subjects.Subject;

public class OctObserver extends Observer {

	public OctObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.print(" " + Integer.toOctalString(subject.getState()));
	}

}
