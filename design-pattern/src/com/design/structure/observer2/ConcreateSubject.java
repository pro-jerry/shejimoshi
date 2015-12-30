package com.design.structure.observer2;

import java.util.Observable;

//目标对象
public class ConcreateSubject extends Observable{

	
	private int state;
	
	public void set(int s){
		
		state = s;
		setChanged();
		notifyObservers(state);
		
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
}
