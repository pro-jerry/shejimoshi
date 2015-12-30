package com.design.behavioral.mediator;

public class Finacal implements Department{

	
	private Mediator mediator;//持有中介者（总经理）的引用
	
	public Finacal(Mediator mediator) {
		super();
		this.mediator = mediator;
		mediator.register("Finacal", this);
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("发工资");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("财务部报告工作");
	}

}
