package com.design.structure.memento;

public class Client {

	public static void main(String[] args) {
		
		CareTaker taker = new CareTaker();
		Emp emp = new Emp("HJ", 14, 2000);
		
		System.out.println("第一次打印对象:"+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());//备忘一次
		
		emp.setAge(30);
		emp.setName("XX");
		emp.setSalary(500);
		
		System.out.println("第二次打印对象:"+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		emp.recovery(taker.getMemento());//恢复到备忘录对象保存的状态
		
		System.out.println("第3次打印对象:"+emp.getName()+"---"+emp.getAge()+"---"+emp.getSalary());
	}
}
