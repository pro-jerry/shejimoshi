package com.design.structure.flyweight;

/**
 * 享元模式 	享元类
 * @author Administrator
 *
 */
public interface ChessFlyWeight {

	void setColor(String c);
	
	String getColor();
	
	void display(Coordinate c);
}


class ConcreteChess implements ChessFlyWeight{

	private String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		// TODO Auto-generated method stub
		this.color = c;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void display(Coordinate c) {
		// TODO Auto-generated method stub
		System.out.println("棋子颜色"+color);
		System.out.println("棋子位置:"+c.getX()+"--"+c.getY());
	}
	
	
}
