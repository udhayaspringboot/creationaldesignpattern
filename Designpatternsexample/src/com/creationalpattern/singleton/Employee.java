package com.creationalpattern.singleton;

public class Employee {
	
	private int empId;
	private String name;
	private float salary;
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	private Employee() {};
	
	private static final Employee emp = new Employee();
	
	public static Employee getInstance()
	{
		return emp;
	}
	

}