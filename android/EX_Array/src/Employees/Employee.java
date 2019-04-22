package Employees;

public class Employee<Job> {

	protected String name;
	protected int id;
	protected double Salary;
	protected int age;
	protected boolean married;
	protected Job job;
	public Employee(String name, int id, double salary, int age, boolean married, Job job) {
		super();
		this.name = name;
		this.id = id;
		Salary = salary;
		this.age = age;
		this.married = married;
		this.job = job;
	}
	
}
