package com.struts.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestHibernate {

	public static void main(String[] args) {
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		//User u = new User();
		/*u.setUserName("咯啊运费");
		u.setPassword("ksdjfklsj");*/
		//u.setUserId(9);
		
		new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);;
		
		session.getTransaction().commit();
		sf.close();
	}
}
