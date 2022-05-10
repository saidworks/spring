package com.luv2code.dao;

import java.util.ArrayList;

import com.luv2code.models.Student;

public interface StudentDao {
	void add();
	void update();
	void delete();
	Student get();
	ArrayList<Student> getAll();
}
