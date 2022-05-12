package com.perscholas.dao;

import java.util.List;

import com.perscholas.entity.Department;
import com.perscholas.entity.Teacher;

public interface TeacherDAO {
	void add(Teacher teacher);
	void delete(int id);
	Teacher get(int id);
	List<Teacher> getAll();
	void update(int id,Teacher t);
}
