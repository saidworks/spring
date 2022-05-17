package com.perscholas.jpa.SMS;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//When this class runs it generates the table
    	//please run it only once after changing the configuration of the property hibernate.hbm2ddl.auto to create 
    	//after change it back to update 
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	
    	
    	try{
    		Session session = factory.openSession();
    		Transaction t = session.beginTransaction();
    		t.commit();
    		System.out.println("successfully created user table");
    		session.close();
    		factory.close();
    		
    	}
    	catch(SessionException e){
    		e.printStackTrace();
    	}
    }
}
