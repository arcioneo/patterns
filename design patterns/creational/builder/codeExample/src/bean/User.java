package bean;

public class User {
	private String	name;
	private String	lastName;
	private String	phone;
	private String	email;
	private String	nickName;

	@SuppressWarnings("unused")
	private User() {
	}

	User(UserBuilder builder) {
		this.name = builder.getName();
		this.lastName = builder.getLastName();
		this.phone = builder.getPhone();
		this.email = builder.getEmail();
		this.nickName = builder.getNickName();
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getNickName() {
		return nickName;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + ", nickName="
				+ nickName + "]";
	}

}
