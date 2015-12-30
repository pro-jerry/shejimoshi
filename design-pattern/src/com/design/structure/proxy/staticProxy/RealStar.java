package com.design.structure.proxy.staticProxy;

public class RealStar implements Star{

	@Override
	public void confer() {

		System.out.println("面谈");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("签合同");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("bookTicket");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("周杰伦唱歌");
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("收钱");
	}

	
}
