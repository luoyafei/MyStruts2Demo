import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.struts.bean.Category;
import com.struts.bean.Msg;
import com.struts.bean.TUuid;
import com.struts.bean.Topic;

public class Test {
	public static Session session = null;
	public static SessionFactory sf = null;
	@BeforeClass
	public static void init() {
		Configuration cfg = new AnnotationConfiguration();
		sf = cfg.configure().buildSessionFactory();
		session = sf.getCurrentSession();
		session.beginTransaction();
	}
	
	@org.junit.Test
	public void test() {
		/*new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);*/
		Query q = session.createQuery("from Category");
		List<Category> cs = (List<Category>)q.list();
		for(Category c : cs)
			System.out.println(c.getName());
		
		
	}
	
	@org.junit.Test
	public void hql02() {
		
		Query q = session.createQuery("from Category c where c.id > 15");
		List<Category> cs = (List<Category>)q.list();
		for(Category c : cs)
			System.out.println(c.getId());
	}
	
	@org.junit.Test
	public void hql03() {
		
		Query q = session.createQuery("from Category c where c.id > :min and c.id < :max").setInteger("min", 15).setInteger("max", 18);
		List<Category> cs = (List<Category>)q.list();
		for(Category c : cs)
			System.out.println(c.getId());
	}
	
	@org.junit.Test
	public void hql04() {
		
		Query q = session.createQuery("from Category c where c.id > :min and c.id < :max order by id desc").setInteger("min", 15).setInteger("max", 18);
		List<Category> cs = (List<Category>)q.list();
		for(Category c : cs)
			System.out.println(c.getId());
	}
	
	@org.junit.Test
	public void hql05() {
		
		Query q = session.createQuery("from Category c where c.id > :min and c.id < :max order by id asc").setInteger("min", 12).setInteger("max", 19);
		q.setMaxResults(4);
		q.setFirstResult(0);
		List<Category> cs = (List<Category>)q.list();
		for(Category c : cs)
			System.out.println(c.getId());
	}
	
	@org.junit.Test
	public void hql06() {
		
		Query q = session.createQuery("from Topic t where t.category.id = 12");
		/*q.setMaxResults(4);
		q.setFirstResult(0);*/
		List<Topic> cs = (List<Topic>)q.list();
		for(Topic c : cs) {
			System.out.println(c.getId());
			System.out.println(c.getCategory().getId());
		}
		
	}

	@org.junit.Test
	public void hql07() {
		
		Query q = session.createQuery("from Msg m where m.topic.category.id = 12");
		/*q.setMaxResults(4);
		q.setFirstResult(0);*/
		List<Msg> cs = (List<Msg>)q.list();
		for(Msg c : cs) {
			System.out.println(c.getCont());
		}
		
	}
	
	@org.junit.Test
	public void hql08() {
		
		//new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);
		TUuid tu = new TUuid();
		tu.setName("火山口附近市");
		System.out.println("402881fc562a505801562a505a120001".length());
		session.save(tu);
	}
	
	@AfterClass
	public static void end() {
		System.out.println("closed");
		session.getTransaction().commit();
		sf.close();
	}
}
