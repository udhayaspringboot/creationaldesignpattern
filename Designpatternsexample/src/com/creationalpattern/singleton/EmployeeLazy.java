package com.creationalpattern.singleton;

public class EmployeeLazy {
	

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

	private EmployeeLazy() {};
	
	private static  EmployeeLazy emp ;
	
	public static EmployeeLazy getInstance()
	{
		if(emp == null)
		{
			emp = new EmployeeLazy();
		}
		return emp;
	}
	


}
