package com.struts.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.struts.bean.Category;

public class TestHibernate {

	public static void main(String[] args) {
		
		new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Category c = new Category();
		c.setName("爱情");
		
		session.save(c);
		
		session.getTransaction().commit();
		sf.close();
	}
}
