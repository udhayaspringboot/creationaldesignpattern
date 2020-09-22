package com.creationalpattern.singleton;

public class Main {

	public static void main(String[] args) {
		
		//Eager Initialization Employee class
		Employee emp = Employee.getInstance();
		
		emp.setEmpId(10);
		emp.setName("Udhay");
		emp.setSalary(43261.45f);
		Employee emp2 = Employee.getInstance();
		emp2.setName("kumar");
		
		System.out.println(".................Eager initialization..............");
		System.out.println("values from emp1: "+emp.getEmpId() + " "+emp.getName() + " "+emp.getSalary() + "\n Hashode is  "+emp.hashCode());
		
		System.out.println("values from emp2 : "+emp2.getEmpId()+" "+emp2.getName() + " "+emp2.getSalary()+"\n Hashode is  "+emp.hashCode());
		
		
      //Lazy Initialization with EmployeeLazy class
		
		EmployeeLazy empLazy = EmployeeLazy.getInstance();
		
		empLazy.setEmpId(05);
		empLazy.setName("Raj");
		empLazy.setSalary(78265.35f);
		
		EmployeeLazy empLazy2 = EmployeeLazy.getInstance();
		
		empLazy2.setEmpId(07);
		empLazy2.setName("kishore");
		empLazy2.setSalary(62315.35f);
		System.out.println(".................Lazy initialization..............");
System.out.println("values from empLazy: "+empLazy.getEmpId() + " "+empLazy.getName() + " "+empLazy.getSalary() + "\n Hashode is  "+empLazy.hashCode());
		
		System.out.println("values from empLazy2 : "+empLazy2.getEmpId()+" "+empLazy2.getName() + " "+empLazy2.getSalary()+"\n Hashode is  "+empLazy2.hashCode());
		
	}

}
