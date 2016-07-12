package com.struts.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Wife {

	private int wifeId = 0;
	private String wifeName = "隔壁老王";
	private User user;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getWifeId() {
		return wifeId;
	}
	public void setWifeId(int wifeId) {
		this.wifeId = wifeId;
	}
	public String getWifeName() {
		return wifeName;
	}
	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}
	
	@OneToOne(mappedBy="wife")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
