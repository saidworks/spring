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
	
//		Department artDept = new Department("Arts");
//		deptImp.add(artDept);
		Department litDept = session.get(Department.class,2);
		Department artDept = session.get(Department.class,5);
		Teacher teacher1 = session.get(Teacher.class,2);
		teacher1.setDepartment(litDept);
	
		
		

		teacherImp.update(2, teacher1);
		Teacher artTeacher = new Teacher();
		artTeacher.setname("Said Artist");
		artTeacher.setSalary("75000");
		artTeacher.setDepartment(artDept);
		teacherImp.add(artTeacher);
		session.close();
	}
}
