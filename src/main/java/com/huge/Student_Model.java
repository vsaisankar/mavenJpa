package com.huge;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Student_Model {
	public students getInfo(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		students s=em.find( students.class,id);
		return s;
		
		 
		
	}
}
