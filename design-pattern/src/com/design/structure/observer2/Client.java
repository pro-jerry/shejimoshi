package com.design.structure.observer2;

public class Client {

	public static void main(String[] args) {
		
		//创建目标对象
		ConcreateSubject concreateSubject = new ConcreateSubject();
		
		//创建观察者
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//将上面三个观察者对象添加到目标目录对象subject的观察者容器中
		concreateSubject.addObserver(obs1);
		concreateSubject.addObserver(obs2);
		concreateSubject.addObserver(obs3);
		
		//改变subject对象的状态
		concreateSubject.set(3000);
		
		System.out.println(obs1.getMyState());
	}
}
