package com.creationalpattern;

import com.creational.abstractfactory.CircleAbstract;
import com.creational.abstractfactory.FactoryAbsract;
import com.creational.abstractfactory.SphereAbstract;
import com.creationalpattern.factory.Trigno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			FactoryAbsract cir = new FactoryAbsract();
			Trigno tri = cir.getArea(new CircleAbstract());
			
			System.out.println("area of circle is "+tri.area(5.3f));
			
			Trigno triSph = cir.getArea(new SphereAbstract());
			System.out.println("area of triangle is "+triSph.area(6.9f));
			

		
	}

}
