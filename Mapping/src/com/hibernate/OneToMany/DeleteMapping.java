package com.hibernate.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteMapping
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");	
	
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Vendor vendor = (Vendor) session.get(Vendor.class,new Integer(101));
		Transaction tx = session.beginTransaction();
		session.delete(vendor);
		tx.commit();
		session.close();
		sf.close();
		System.out.println("One to Many Delete is done");
        
	}
  
}
