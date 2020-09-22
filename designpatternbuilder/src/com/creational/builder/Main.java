package com.creational.builder;

public class Main {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee.EmployeeBUilder(1,"udhay",45369.56f).setMobileNo(7896541236L).setCompanyName("HCL").build();

		System.out.println("values are "+emp.getEmpId() + " "+emp.getName() + " "+emp.getSalary() + " "+emp.getMobileNo()+" "+emp.getCompanyName());
	}

}
