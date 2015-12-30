package com.design.structure.adapter;

/**
 * 客户端（笔记本，只有USB接口）
 * @author Administrator
 *
 */
public class Client {

	public void test(Target t){
		
		t.handleReq();
	}
	
	public static void main(String[] args) {
		
		Client c = new Client();
		Adaptee a = new Adaptee();
		
//		Target t = new Adapter();
		Target t = new Adapter2(a);
		c.test(t);
	}
	
}
