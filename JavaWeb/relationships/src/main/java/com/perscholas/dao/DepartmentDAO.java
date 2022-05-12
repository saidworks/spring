package com.perscholas.dao;

import java.util.List;

import com.perscholas.entity.Department;

public interface DepartmentDAO {
	void add(Department dept);
	void delete(int id);
	Department get(int id);
	List<Department> getAll();
	void update(int id,Department dept);
}
