package com.bhavesh.test;
import com.bhavesh.entity.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FinalTest {

	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		
		cfg = new Configuration();
		cfg.configure("com/bhavesh/cfgs/hibernate.cfg.xml");
		
		sessionFactory = cfg.buildSessionFactory(); 
		session = sessionFactory.openSession();
		
		Product product = new Product();
		product.setPid(1);
		product.setPname("MotherBoard");
		product.setPrice(1000.00f);
		product.setQty(5.00f);
		
		try {
			transaction = session.beginTransaction();
			session.save(product);
			transaction.commit();
			System.out.println("Object is saved");
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
			
	}

}
