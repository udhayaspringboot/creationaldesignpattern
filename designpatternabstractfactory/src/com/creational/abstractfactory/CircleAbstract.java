package com.creational.abstractfactory;

import com.creationalpattern.factory.Circle;
import com.creationalpattern.factory.Trigno;

public class CircleAbstract implements AreaAbstract {

	@Override
	public Trigno getArea() {
		
		return new Circle();
	}

}
