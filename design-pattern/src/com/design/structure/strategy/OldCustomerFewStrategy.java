package com.design.structure.strategy;

public class OldCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {

		System.out.println("打8.5zhe");
		return standarPrice*0.85;
	}

	
}
