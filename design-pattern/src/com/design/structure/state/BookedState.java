package com.design.structure.state;

/**
 * 已预订
 * @author Administrator
 *
 */
public class BookedState implements State{

	@Override
	public void handle() {

		System.out.println("房间已预订");
	}

	
	
}
