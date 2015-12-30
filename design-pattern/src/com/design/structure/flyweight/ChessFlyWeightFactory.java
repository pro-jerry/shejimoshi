package com.design.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * @author Administrator
 *
 */
public class ChessFlyWeightFactory {

	//享元池
	private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String colors){
		
		if(map.get(colors)!=null){
			
			return map.get(colors);
		}else{
			ChessFlyWeight cfw = new ConcreteChess(colors);
			map.put(colors, cfw);
			return cfw;
		}
	}
	
}
