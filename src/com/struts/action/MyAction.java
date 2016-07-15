package com.struts.action;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.bean.User;
import com.struts.bean.UserDTO;
/**
 * 测试struts2的一个action
 * @author Diamond
 */
public class MyAction extends ActionSupport {
	
	
	private UserDTO user;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	/*private int userId;
	private String userName;
	private String password;
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
	}*/
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		//HttpServletRequest request = ServletActionContext.getRequest();
		//userName = request.getParameter("userName");
		//password = request.getParameter("password");
		String userName = user.getUserName();
		String password = user.getPassword();
System.out.println("这里是接受过来的值：" + userName + ":" + password);
		if(userName.trim().hashCode() != 0 && password.trim().hashCode() != 0) {
			
			Configuration cfg = new AnnotationConfiguration();
			SessionFactory sf = cfg.configure().buildSessionFactory();
			Session session = sf.openSession();
			
			session.beginTransaction();
			String sqlQuery = "from User where userName = ?";
			Query q = session.createQuery(sqlQuery);
			q.setParameter(0, userName);
			List<User> users = q.list();
			session.getTransaction().commit();
			
			if(users.size() >= 1) {
				for(int i = 0; i < users.size(); i++) {
					if(users.get(i).getPassword().equals(password)) {
						ServletContext application = ServletActionContext.getServletContext();
						application.setAttribute("user", users.get(i));
						return SUCCESS;
					}
				}
				return ERROR;
			} else
				return ERROR;
		} else {
System.out.println("用户输入了空白值！");
			return ERROR;
		}
	}
	
	public String reg() {
		String address = ServletActionContext.getRequest().getRemoteAddr();
System.out.println("访问者的IP:" + address);
		return INPUT;
	}
	
	public String rrdir() {
		return "success2";
	}
	
	
	public String redirectActionDemo() {
		return "success";
	}
	
	public String validation() throws Exception {
		
		String userName = user.getUserName();
		String password = user.getPassword();
System.out.println("这里是接受过来的值：" + userName + ":" + password);
		if(userName.trim().hashCode() != 0 && password.trim().hashCode() != 0) {
			User u = new User();
			u.setUserName(userName);
			u.setPassword(password);
			
			Configuration cfg = new AnnotationConfiguration();
			SessionFactory sf = cfg.configure().buildSessionFactory();
			Session session = sf.getCurrentSession();
			session.beginTransaction();

			session.save(u);
			
			session.getTransaction().commit();;
			
			ServletContext application = ServletActionContext.getServletContext();
			application.setAttribute("user", u);
			HttpSession hsession = ServletActionContext.getRequest().getSession();
			hsession.setAttribute("user", u);
			
			return SUCCESS;
		} else
			return INPUT;
	}
}
