package com.luv2code.app;

import com.luv2code.controller.EmployeeController;


public class Main {
	public static void main(String[] args) {

		EmployeeController empControl = new EmployeeController();
//		empControl.createEmployeeTable();
		empControl.findEmployeeByname();
//		empControl.ShowOfficeCodes_AsDepartment();
	}
}
