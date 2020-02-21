package com.gvl.utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {
	
	private static SessionFactory sessionfactory;
	
	static {
		try {
			//sessionfactory = new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).buildMetadata().buildSessionFactory();
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure().build();
		    Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			sessionfactory = metaData.getSessionFactoryBuilder().build();
		} catch (Throwable e) {
			e.printStackTrace();
			throw e;			
		}
		
	}

	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	
	public static void closeSessionFactory(SessionFactory sessionfactory)
	{
		if(sessionfactory != null) {
			sessionfactory.close();
		}
	}

}
