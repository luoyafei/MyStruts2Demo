package com.struts.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 测试struts2的一个action
 * @author Diamond
 */
public class TokenAction extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private Date d;
	private Timestamp time;
	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	private List<String> habit;
	
	
	public List<String> getHabit() {
		return habit;
	}

	public void setHabit(List<String> habit) {
		this.habit = habit;
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

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		System.out.println(name + "," + age + "," + d + "," + time + "," + habit.size());
		System.out.println("validate()方法执行！");
	}
	
	/**
	 * 
	 * 该方法在execute()前执行！
	 */
	public void validateExecute() {
		System.out.println("validateExecute()方法执行！");
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
}
