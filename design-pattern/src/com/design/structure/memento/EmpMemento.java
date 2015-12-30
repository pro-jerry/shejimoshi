package com.design.structure.memento;

/**
 * 备忘录类
 * @author Administrator
 *
 */
public class EmpMemento {

	private String name;
	private int age;
	private double salary;
	
	
	
	public EmpMemento(Emp p) {
		super();
		this.age = p.getAge();
		this.name = p.getName();
		this.salary = p.getSalary();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
