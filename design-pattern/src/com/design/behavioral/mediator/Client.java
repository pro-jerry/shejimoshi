package com.design.behavioral.mediator;

public class Client {

	public static void main(String[] args) {
		
		Mediator m = new President();
		
		Market market = new Market(m);
		Development development = new Development(m);
		Finacal finacal = new Finacal(m);
		
		market.selfAction();
		market.outAction();
	}
}
