package com.design.behavioral.mediator;

public class Development implements Department{

	private Mediator mediator;//持有中介者（总经理）的引用
	
	
	public Development(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("development", this);
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("研发部专心研究");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("向总经理报告");
	}

	
}
