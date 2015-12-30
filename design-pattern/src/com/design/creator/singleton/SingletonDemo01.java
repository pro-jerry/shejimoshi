package com.design.creator.singleton;

/**
 * 单例模式饿汉式
 * 天然线程安全的模式
 * @author Administrator
 *
 */
public class SingletonDemo01 {

	private SingletonDemo01() {
		super();
	}
	//类初始化时，立即加载（没有延时加载的优势）这个对象
	private static SingletonDemo01 instance  = new SingletonDemo01();
	
	//方法没有同步调用效率高
	public static  SingletonDemo01 newInstance(){
		
		return instance;
	}
	
}
