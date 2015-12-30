package com.design.behavioral.mediator;

public class Market implements Department{

	
	private Mediator mediator;//持有中介者（总经理）的引用
	
	public Market(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("Market", this);
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("市场部日常");
		mediator.command("finacal");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("市场部报告工作");
	}

}
