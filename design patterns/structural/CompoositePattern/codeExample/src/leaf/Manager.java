package leaf;

import java.util.ArrayList;
import java.util.List;

import components.base.Employee;

public class Manager extends Employee {

	private String			name;
	private String			salary;
	private List<Employee>	employees;

	public Manager(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;

		employees = new ArrayList<Employee>();
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
		System.out.println("Manager [name=" + name + ", salary=" + salary + "]");
		System.out.println("My employees are:");

		for (Employee employee : employees) {
			employee.print();
		}
	}

	@Override
	public Employee getEmployee(int index) {
		return employees.get(index);
	}

	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);
	}

}
