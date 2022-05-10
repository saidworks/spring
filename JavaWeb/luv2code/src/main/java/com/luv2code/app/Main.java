package com.luv2code.app;

import com.luv2code.controller.EmployeeController;
import com.luv2code.dao.StudentDaoImp;

public class Main {
	public static void main(String[] args) {
//		StudentDaoImp db = new StudentDaoImp();
//		db.add();
		EmployeeController empControl = new EmployeeController();
//		empControl.createEmployeeTable();
		empControl.findEmployeeByname();
//		empControl.ShowOfficeCodes_AsDepartment();
	}
}
