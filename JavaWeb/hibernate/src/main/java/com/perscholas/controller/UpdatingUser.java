package com.perscholas.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.model.User;

public class UpdatingUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User u = new User();
		u.setId(3);
		u.setEmail("wroales@perscholas");
		u.setFullname("W Roales");
        u.setPassword("123456");
        u.setSalary(630000.99);
        session.update(u);
        session.getTransaction().commit();
        session.close();

	}
}
