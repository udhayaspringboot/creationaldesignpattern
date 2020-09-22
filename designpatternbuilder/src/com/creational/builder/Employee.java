package com.creational.builder;



public class Employee {
	
	private int empId;
	private String name;
	private float salary;
	private long mobileNo;
	private String companyName;
	
	public int getEmpId() {
		return empId;
	}

	

	public String getName() {
		return name;
	}

	

	public float getSalary() {
		return salary;
	}
	
	




	public long getMobileNo() {
		return  mobileNo;
	}



	public String getCompanyName() {
		return companyName;
	}



	



	private Employee(EmployeeBUilder empBuil) {
		
		this.empId = empBuil.empId;
		this.name = empBuil.name;
		this.salary = empBuil.salary;
		this.mobileNo = empBuil.mobileNo;
		this.companyName = empBuil.companyName;
	}



	public static class EmployeeBUilder
	{
		private int empId;
		private String name;
		private float salary;
		private long mobileNo;
		private String companyName;
		
		
		public EmployeeBUilder setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
			return this;
		}

		public EmployeeBUilder setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		public EmployeeBUilder(int empId, String name, float salary) {
			super();
			this.empId = empId;
			this.name = name;
			this.salary = salary;
		}
		
		public Employee build()
		{
			return new Employee(this);
		}
	}
	
	

}
