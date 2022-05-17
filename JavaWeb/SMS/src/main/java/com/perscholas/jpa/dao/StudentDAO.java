package com.perscholas.jpa.dao;

import java.util.List;

import com.perscholas.jpa.entitymodels.Course;
import com.perscholas.jpa.entitymodels.Student;

public interface StudentDAO {
	List<Student> getAllStudents();

	Student getStudentByEmail(String sEmail);

	boolean validateStudent(String sEmail, String sPassword);

	void registerStudentToCourse(String sEmail, int cId);

	List<Course> getStudentCourses(String sEmail);
}
