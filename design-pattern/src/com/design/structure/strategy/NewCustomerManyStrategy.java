package com.design.structure.strategy;

public class NewCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {

		System.out.println("打9折");
		return standarPrice*0.9;
	}

	
}
