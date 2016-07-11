package com.struts.bean;

import java.io.Serializable;

/**
 * 使用联合主键，创建UserUK作为User的联合主键，该类必须实现Serializable接口,并且实现equals和hashCode方法(这两个方法非必需实现)
 * @author Diamond
 */
public class UserUK implements Serializable {

	private int userId = 0;
	private String userName = "游客";
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public boolean equals(Object o) {
		
		if(o instanceof UserUK) {
			UserUK uk = (UserUK)o;
			if(this.userId == uk.getUserId() && this.userName == uk.getUserName())
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {

		return this.userName.hashCode();
	}
	
	
}
