package com.design.creator.builder;

public class HAirshipDirector implements AirshipDirector{

	private AirShipBuilder builder;
	
	public HAirshipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}


	/**
	 * 装配飞船
	 */
	@Override
	public AirShip directAirShip() {

		Engine e= builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setOrbitalModule(o);
		ship.setEscapeTower(et);
		
		return ship;
	}

	
}
