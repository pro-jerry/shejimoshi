package com.design.creator.singleton;

/**
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		
		SingletonDemo01 s1 = SingletonDemo01.newInstance();
		SingletonDemo01 s2 = SingletonDemo01.newInstance();
		
		System.out.println(SingletonDemo05.INSTANCE == SingletonDemo05.INSTANCE);
	}
}
