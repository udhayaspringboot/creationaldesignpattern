package com.creationalpattern.factory;

public class Circle implements Trigno {

	@Override
	public float area(float radi) {
		
		//float rad = 3.14 * (radi*radi));
		return (float) (3.14*(radi*radi));
	}
	
	
	
}
