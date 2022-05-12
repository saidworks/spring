package com.perscholas.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.perscholas.entity.Department;
import com.perscholas.entity.Teacher;

public class TeacherDAOImp implements TeacherDAO {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	public TeacherDAOImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Teacher teacher) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(teacher);
		
		t.commit();
		
	
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Teacher get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Teacher> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int id, Teacher teacher) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Teacher old = session.get(Teacher.class,id);
//		Department dept = session.get(Department.class,d.getid());
		old.setDepartment(teacher.getDepartment());
		old.setname(teacher.getname());
		old.setSalary(teacher.getSalary());
		session.update(old);;
		t.commit();
		session.close();
	}

}
