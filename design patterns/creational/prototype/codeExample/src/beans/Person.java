package beans;

public class Person implements Cloneable {

	private String	name;
	private String	lastName;
	private String	nickName;
	private String	email;

	public Person() {
		super();
	}

	public Person(String name, String lastName, String nickName, String email) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.nickName = nickName;
		this.email = email;
	}

	public Person clone() {
		try {
			return (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
