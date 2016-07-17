package com.struts.bean;

public class UserDTO {

	private String userName = "";
	private String password = "";
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static String myName = "咯亚非";
	
	public static String myNames() {
System.out.println("there is myName() ");
		return "There is myName()";
	}
	public String inputSomeThing() {
		System.out.println("i am input!");
		return "input";
	}
}
