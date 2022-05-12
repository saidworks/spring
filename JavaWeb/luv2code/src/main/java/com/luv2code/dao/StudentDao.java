package com.luv2code.dao;

import java.util.ArrayList;
import java.util.List;

import com.luv2code.models.Student;

public interface StudentDao {
	void add(Student u);
	void update(int id,Student s);
	void delete(int id);
	Student get(int id);
	List<Student> getAll();
	void deleteAll();
}
