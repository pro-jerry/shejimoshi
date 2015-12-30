package com.design.creator.builder;

public class HAirshipBuilder implements  AirShipBuilder{

	@Override
	public Engine builderEngine() {

		System.out.println("构建发送机");
		return new Engine("HEJUN发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {

		System.out.println("构建轨道舱");
		return new OrbitalModule("HEJUN轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		
		System.out.println("构建逃逸塔");
		return new EscapeTower("HEJUN逃逸塔");
	}

}
