package com.creational.abstractfactory;

import com.creationalpattern.factory.Sphere;
import com.creationalpattern.factory.Trigno;

public class SphereAbstract implements AreaAbstract {

	@Override
	public Trigno getArea() {
		// TODO Auto-generated method stub
		return new Sphere();
	}

}
