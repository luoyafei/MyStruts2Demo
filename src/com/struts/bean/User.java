package com.struts.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/* 
	+----------+-------------+------+-----+---------+----------------+
	| Field    | Type        | Null | Key | Default | Extra          |
	+----------+-------------+------+-----+---------+----------------+
	| userId   | int(11)     | NO   | PRI | NULL    | auto_increment |
	| userName | varchar(20) | NO   |     | NULL    |                |
	| password | varchar(20) | NO   |     | NULL    |                |
	+----------+-------------+------+-----+---------+----------------+
 */
/**
 * 创建测试Struts2 的User实体bean
 * @author Diamond
 */
@Entity
@SequenceGenerator(name="userSEQ", sequenceName="userSEQ_DB")
public class User {

	private int userId = 0;
	private String userName = "游客";
	private String password = "12345";
	
	@Id
	@GeneratedValue(generator="userSEQ", strategy=GenerationType.AUTO)
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
