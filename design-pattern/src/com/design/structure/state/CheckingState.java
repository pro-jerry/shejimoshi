package com.design.structure.state;

/**
 * 已入住状态
 * @author Administrator
 *
 */
public class CheckingState implements State{

	@Override
	public void handle() {

		System.out.println("房间已入住");
	}

	
	
}
