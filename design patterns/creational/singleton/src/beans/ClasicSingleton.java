package beans;

public class ClasicSingleton {

	private static ClasicSingleton instance = null;

	private ClasicSingleton() {

	}

	public static ClasicSingleton getInstance() {
		if (instance == null) {
			instance = new ClasicSingleton();
		}
		return instance;
	}

}
