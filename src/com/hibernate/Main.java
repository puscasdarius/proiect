package com.hibernate;

import javax.mail.Session;

public class Main {

	private static Hibernate h = new Hibernate();
	
/*	public static void main(String args[]){
		System.out.println("Main");
		DAO dao = new DAO();
		dao.add(h.getSession(),new POJOClient() ,null);
		
	}*/
	
	public static void main(String args[]){
		System.out.println("Ana are mere");
		DAO dao = new DAO();
		dao.add(h.config(), new POJOClient() ,null);
	}
}
