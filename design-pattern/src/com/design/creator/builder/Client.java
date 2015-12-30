package com.design.creator.builder;

public class Client {

	public static void main(String[] args) {
		
		
		AirshipDirector director = new HAirshipDirector(new HAirshipBuilder());
		
		AirShip ship = director.directAirShip();
		System.out.println(ship.getEngine().getName());
		ship.launch();
		
	}
}
