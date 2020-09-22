package com.creational.prototype;

import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {


		Employee emp = new Employee();
		
		emp.loadData();
		
		Employee emp1 = (Employee) emp.clone();
		Employee emp2 = (Employee) emp.clone();
		
		List<String> emp3 = emp1.getListNames();
		emp3.add("soorya");
		List<String> emp4 = emp2.getListNames();
		emp4.remove("rr");
		
		System.out.println("Employee List " +emp.getListNames());
		
		System.out.println("...................After cloning.............");
		System.out.println("Emp3 values ");
		for (String name1 : emp3) {
			System.out.println(name1);
			
		}
		System.out.println("Emp4 values ");
		for (String name2 : emp4) {
			System.out.println(name2);
		}
		

	}

}
