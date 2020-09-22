package com.creationalpattern.factory;

public class Factory {
	
	public  Trigno getInstance(String name)
	{
		if(name.equals("circle"))
		{
			return new Circle();
		}else
		{
			return new Sphere();
		}
	}

}
