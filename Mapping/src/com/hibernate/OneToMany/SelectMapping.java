package com.hibernate.OneToMany;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectMapping 
{
	public static void main(String[] args) 
	{
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 
		 Vendor vendor = (Vendor)session.get(Vendor.class,new Integer(101));
		 
		 System.out.println("Vendor id is "+vendor.getVendorid());
		 System.out.println("Vendor name is "+vendor.getVendorName());
		 System.out.println();
		 
		 Set s = vendor.getChildren();
		 
		 Iterator<Customer> i = s.iterator();
		 
		 while(i.hasNext())
		 {
			 Customer c = i.next();
			 System.out.println("CustomerId is "+c.getCustomerId());
			 System.out.println("Customer Name is "+c.getCustomerName());
		 }
	}
    
     
}
