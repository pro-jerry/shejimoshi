package com.design.behavioral.mediator;

/**
 * 同事类接口
 * @author Administrator
 *
 */
public interface Department {

	void selfAction();//做本部门的事情
	
	void outAction();//向总经理发出申请
	
}
