package com.creational.abstractfactory;

import com.creationalpattern.factory.Trigno;

public class FactoryAbsract {
	
	public Trigno getArea(AreaAbstract ab)
	{
	
		return ab.getArea();
	}

}
