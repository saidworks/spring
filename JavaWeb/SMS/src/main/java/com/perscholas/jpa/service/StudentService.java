package com.perscholas.jpa.service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.perscholas.jpa.dao.StudentDAO;
import com.perscholas.jpa.entitymodels.Course;
import com.perscholas.jpa.entitymodels.Student;

public class StudentService implements StudentDAO {
	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	public StudentService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		String hql = "FROM Student";
		Query<Student> query = session.createQuery(hql);
		List<Student> students = query.getResultList();
//		Iterator<Student> elements = students.iterator();
//		while(elements.hasNext()) {
//			System.out.println(elements.next());
//		}
		return students;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		// TODO Auto-generated method stub
		String hql = "FROM Student s WHERE s.sEmail=:email";
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
//		Student s = session.get(Student.class, id);
		Query query =session.createQuery(hql);
		query.setParameter("email",sEmail);
		Student s = (Student) query.getSingleResult();
		System.out.println(s);
		session.close();
		return s;
	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
	
//		session.save();
//		t.commit();
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		StudentService sts = new StudentService();
		sts.getStudentByEmail("sbowden1@yellowbook.com");
	}
}
