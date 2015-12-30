package com.design.creator.singleton;

/**
 * 单例模式懒汉式
 * 
 * @author Administrator
 *
 */
public class SingletonDemo02 {

	private static SingletonDemo02 s;

	public SingletonDemo02() {
	}
	
	//方法同步，调用效率低
	public static synchronized SingletonDemo02 newInstance(){
		
		if(s==null){
			
			s = new SingletonDemo02();
		}
		
		return s;
	}
}
