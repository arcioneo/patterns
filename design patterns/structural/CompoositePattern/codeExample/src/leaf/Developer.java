package leaf;

import components.base.Employee;

public class Developer extends Employee {

	private String	name;
	private String	salary;

	public Developer(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("Developer [name=" + name + ", salary=" + salary + "]");
	}

}
