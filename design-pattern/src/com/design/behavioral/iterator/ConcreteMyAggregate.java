package com.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 * @author Administrator
 *
 */
public class ConcreteMyAggregate {

	private List<Object> list = new ArrayList<Object>();

	public void addObject(Object obj){
		
		this.list.add(obj);
	}
	
	
	public void removeObject(Object obj){
		
		this.list.remove(obj);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	
	//迭代器
	public MyIterator createIterator(){
		
		return new ConcreteIterator();
	}
	
	//使用内部类定义迭代器，可以直接使用外部类的属性
	private class ConcreteIterator implements MyIterator{

		private int cursor;//定义游标，用于记录遍历时的位置
		
		@Override
		public void first() {
			// TODO Auto-generated method stub
			cursor = 0;
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(cursor<list.size()){
				cursor++;
			}
			
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(cursor<list.size()){
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return cursor==0?true:false;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return cursor==(list.size()-1)?true:false;
		}

		@Override
		public Object getCurrentObj() {
			// TODO Auto-generated method stub
			return list.get(cursor);
		}
		
		
	}
}
