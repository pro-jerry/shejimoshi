package com.design.creator.factory.factorymethod;

public class AudiFactory implements CarFactory{

	@Override
	public Car createCar() {

		return new Audi();
	}

}
