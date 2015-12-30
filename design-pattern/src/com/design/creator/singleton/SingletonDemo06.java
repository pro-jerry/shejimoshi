package com.design.creator.singleton;

import java.io.Serializable;

/**
 * 测试懒汉式单例模式（如何防止反射与反序列化漏洞）
 * @author Administrator
 *
 */
public class SingletonDemo06 implements Serializable {

	private static SingletonDemo06 s;

	public SingletonDemo06() {
		
		if(s==null){
			throw new RuntimeException();
		}
	}
	
	//方法同步，调用效率低
	public static synchronized SingletonDemo06 newInstance(){
		
		if(s==null){
			
			s = new SingletonDemo06();
		}
		
		return s;
	}
}
