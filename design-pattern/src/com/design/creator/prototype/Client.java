package com.design.creator.prototype;

import java.util.Date;

/**
 * 测试原型模式(浅克隆)
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		
		Sheep s1 = new Sheep("少利", new Date());
		System.out.println(s1.getBirthday());
		System.out.println(s1);
		
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s2);
		System.out.println(s2.getBirthday());
	}
	
}
