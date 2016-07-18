package com.struts.bean;

public class Cattle {
	private String name;
	private int age;
	
	public Cattle(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cattle|name:" + name + ",age|" + age;
	}
	
}
