package com.design.creator.factory.abstractfactory;

public interface Engine {

	void run();
	void start();
}


class LuxuryEngine implements Engine{

	@Override
	public void run() {
		
		System.out.println("转速快。。。。");
	}

	@Override
	public void start() {

		System.out.println("启动快。。。。！可以自动启停");
	}
}

class LowerEngine implements Engine{

	@Override
	public void run() {
		
		System.out.println("转速慢。。。。");
	}

	@Override
	public void start() {

		System.out.println("启动慢。。。。！");
	}
}


