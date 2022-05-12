package com.perscholas.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.entity.Department;

public class DepartmentDAOImp implements DepartmentDAO {
	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	public DepartmentDAOImp() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void add(Department dept) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(dept);
		
		t.commit();

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Department get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, Department dept) {
		// TODO Auto-generated method stub

	}

}
