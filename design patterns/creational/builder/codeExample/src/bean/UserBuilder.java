package bean;

public class UserBuilder {
	private String	name;
	private String	lastName;
	private String	phone;
	private String	email;
	private String	nickName;

	public UserBuilder() {
	}

	public User build() {
		return new User(this);
	}

	public UserBuilder name(String name) {
		this.name = name;
		return this;
	}

	public UserBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	public UserBuilder email(String email) {
		this.email = email;
		return this;
	}

	public UserBuilder nickName(String nickName) {
		this.nickName = nickName;
		return this;
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

}
