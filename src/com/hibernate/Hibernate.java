package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
	
	public static void main(String args[]){
		
	}
	
	public  Session config(){
		SessionFactory sf = null;
		Session s = null;
		
		Configuration conf = new Configuration();
		conf.addAnnotatedClass(com.hibernate.POJOClient.class);
		conf.configure("hibernate.cfg.xml");
		
		sf = conf.buildSessionFactory();
		s = sf.openSession();

		return s;
	}
	
	

}
