package com.perscholas.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.perscholas.dao.DepartmentDAO;
import com.perscholas.dao.DepartmentDAOImp;
import com.perscholas.dao.TeacherDAO;
import com.perscholas.dao.TeacherDAOImp;
import com.perscholas.entity.Department;
import com.perscholas.entity.Teacher;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		TeacherDAO teacherImp = new TeacherDAOImp();
		DepartmentDAO deptImp = new DepartmentDAOImp();
	
//		Department department2 = new Department("Painting");
//		deptImp.add(department2);
		
		Teacher teacher1 = session.get(Teacher.class,2);
		Department department1 = session.get(Department.class,4);
		teacher1.setDepartment(department1);
		session.close();
		
		
		System.out.println(teacher1.getDepartment().getname());
		teacherImp.update(2, teacher1);
	
		teacherImp.add(teacher1);

	}
}
