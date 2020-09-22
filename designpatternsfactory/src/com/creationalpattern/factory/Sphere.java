package com.creationalpattern.factory;

public class Sphere implements Trigno {

	@Override
	public float area(float radi) {
		
		float ar = (float) 12.56*radi*radi;
		
		return ar;
	}
	
	
	

}
