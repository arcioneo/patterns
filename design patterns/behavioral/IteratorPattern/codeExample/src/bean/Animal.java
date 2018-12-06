package bean;

public class Animal {
	private String	type;
	private String	name;

	public Animal(String name, String type) {
		super();
		this.type = type;
		this.name = name;
	}

	public Animal() {
		super();
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

}
