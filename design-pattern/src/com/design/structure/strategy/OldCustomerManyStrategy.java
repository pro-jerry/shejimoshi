package com.design.structure.strategy;

public class OldCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {

		System.out.println("打8zhe");
		return standarPrice*0.8;
	}

	
}
