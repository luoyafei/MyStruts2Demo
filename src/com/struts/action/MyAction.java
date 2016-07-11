package com.struts.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.bean.User;
/**
 * 测试struts2的一个action
 * @author Diamond
 */
@SuppressWarnings("serial")
public class MyAction extends ActionSupport {
	
	private int userId = 0;
	private String userName = "游客";
	private String password = "12345";
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
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
System.out.println("这里是接受过来的值：" + userName + ":" + password);
		if(userName.trim().hashCode() != 0 && password.trim().hashCode() != 0) {
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			
			Configuration cfg = new AnnotationConfiguration();
			SessionFactory sf = cfg.configure().buildSessionFactory();
			Session session = sf.openSession();
			
			session.beginTransaction();
			
			session.save(user);
			
			session.getTransaction().commit();
			
			return SUCCESS;
		} else {
System.out.println("用户输入了空白值！");
			return new String("null");
		}
	}
	
	public String validation() {
System.out.println("这里是方法validataion（）");
		User u = new User();
		u.setUserName(userName);
		u.setPassword(password);
System.out.println(userName + ":" + password);
		if(userName.trim().hashCode() == 0 && password.trim().hashCode() == 0) {
			return NONE;
		}
		return INPUT;
	}
}
