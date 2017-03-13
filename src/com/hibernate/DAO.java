package com.hibernate;

import java.util.List;

import org.hibernate.Session;

public class DAO {

	public boolean add(Session s,Object table,List data){
		
		System.out.println(getNameClass(table));
		
		return true;
		
	}
	
	public String getNameClass(Object obj){
		
		return obj.getClass().toString().substring(20);
	}
}
