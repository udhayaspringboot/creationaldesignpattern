package com.creationalpattern.factory;

public class Main {

	public static void main(String[] args) {
		
		Factory fact = new Factory();
		Trigno tri = fact.getInstance("circl");
		
		System.out.println("area is " +tri.area(5.0f));

	}

}
