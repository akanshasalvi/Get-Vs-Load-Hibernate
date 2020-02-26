package com.gvl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gvl.entities.Person;
import com.gvl.utility.SessionFactoryRegistry;

public class Test {

	public static void main(String[] args) {
	
		SessionFactory sessionfactory = SessionFactoryRegistry.getSessionfactory();
		Session session = sessionfactory.openSession();
		Person person = session.load(Person.class, "P01");
		System.out.println(person.getAge());
		System.out.println(person.getClass().getCanonicalName());
		
		session.close();
	}	
			
		public static void store(Session session)
		{
			Transaction transaction = null;
			boolean flag = false;
		
			try {
		
		
			Person person = new Person();
			transaction = session.beginTransaction();
			person.setPerson_id("P02");
			person.setPerson_name("Rick");
			person.setAge(20);
			person.setGender("Male");
			person.setEmail_address("rick@gmail.com");
			person.setContact_no("6574839475");
			session.save(person);
			flag=true;
			transaction.commit();
		
			}finally {
			if(session != null)
				if(flag)
				{
					transaction.commit();
				}else
				{
					transaction.rollback();
				}
			}
		}
	
	/*public static void store(Session session)
	{
		Transaction transaction = null;
		boolean flag = false;
		
		try {
		Person person = new Person();
		transaction = session.beginTransaction();
		person.setPerson_id("P01");
		person.setPerson_name("John");
		person.setAge(20);
		person.setGender("Male");
		person.setEmail_address("john@gmail.com");
		person.setContact_no("7894568903");
	    session.save(person);
	    flag=true;
		transaction.commit();
		}finally {
			if(session != null)
				if(flag)
				{
					transaction.commit();
				}else
				{
					transaction.rollback();
				}
		}
		}*/
	}


