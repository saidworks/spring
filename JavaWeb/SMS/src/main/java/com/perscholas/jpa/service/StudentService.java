package com.perscholas.jpa.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.perscholas.jpa.dao.StudentDAO;
import com.perscholas.jpa.entitymodels.Course;
import com.perscholas.jpa.entitymodels.Student;
import com.perscholas.jpa.entitymodels.StudentCourse;

public class StudentService implements StudentDAO {
	private SessionFactory factory  = new Configuration().configure().buildSessionFactory();;
	private CourseService cService = new CourseService();;
	
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
		Iterator<Student> elements = students.iterator();
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
		return students;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		// TODO Auto-generated method stub
		String hql = "FROM Student s WHERE s.sEmail=:email";
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Student s = null;
		try {
//		Student s = session.get(Student.class, id);
		Query query =session.createQuery(hql);
		query.setParameter("email",sEmail);
		s = (Student) query.getSingleResult();
		
	
		}
		catch (NoResultException e) {
		 	if (t != null) {
		 		t.rollback();
			   }
			   throw e;
		}
		
		session.close();
		return s;
			
	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
		Student st = session.find(Student.class, sEmail);
		if(st != null && st.getsPass().equals(sPassword)) {
			return true;
		}
		t.commit();
		}
		catch (NoResultException e) {
		 	if (t != null) {
		 		t.rollback();
			   }
			   throw e;
		}
		session.close();
		return false;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try{
		String hql = "FROM StudentCourse sc"
				+ " WHERE sc.stEmail=:email AND sc.stCourseId=:id";
		Query<StudentCourse> query =  session.createQuery(hql);
		query.setParameter("email", sEmail);
		query.setParameter("id", cId);
		if(query.uniqueResult() == null) {
			StudentCourse sc = new StudentCourse();
			sc.setStCourseId(cId);
			sc.setStEmail(sEmail);
			try{
			System.out.printf("%20s %30s %20s\n" ,getStudentByEmail(sEmail).getsName()," successfully, registered to : ",cService.getAllCourses().get(cId-1).getcName());
			session.save(sc);}			
			catch(IndexOutOfBoundsException e) {
				System.out.println("No course has the id "+cId);
			}
			
		}
		else {
			System.out.println(" Already registered to this course");
		}
			
		t.commit();
		}
		catch (NoResultException e) {
		 	if (t != null) {
		 		t.rollback();
			   }
			   throw e;
		}
		session.close();
		
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// TODO Auto-generated method stub
		Student s = getStudentByEmail(sEmail);
		return s.getsCourses();
	}
	
	
//	public static void main(String[] args) {
//		StudentService ss = new StudentService();
//
//	}
}
