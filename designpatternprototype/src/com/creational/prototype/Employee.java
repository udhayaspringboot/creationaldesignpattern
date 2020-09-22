package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	private List<String> listNames;

	
	public Employee()
	{
		listNames = new ArrayList<String>();
	}
	
	
public void loadData()
{
	listNames.add("udhay");
	listNames.add("kumar");
	listNames.add("msd");
	listNames.add("mi");
	listNames.add("rr");
}

	public List<String> getListNames() {
		return listNames;
	}

	public void setListNames(List<String> listNames) {
		this.listNames = listNames;
	}

	public Employee(List<String> listNames) {
		
		this.listNames = listNames;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String > lisN = new ArrayList<>();
		
		for (String nam : listNames) {
			
			lisN.add(nam);
			
		}
		return new Employee(lisN);
	}

}
