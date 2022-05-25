package com.perscholas.jpa.mainrunner;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import com.perscholas.jpa.service.*;
import com.perscholas.jpa.entitymodels.*;
public class SMSRunner {
	private Scanner scan; 
	private StudentService stService;
	private CourseService cService;
	private Student st;
	public SMSRunner() {
		scan = new Scanner(System.in); 
		stService = new StudentService();
		cService = new CourseService();
		st = new Student();
	}
	
	public static void main(String[] args) {	
		SMSRunner sms = new SMSRunner();
		sms.run();
		sms.scan.close();
	}

	
	void run() {
		int choice = menu();
		if(choice==1) {
			studentLogin();
			registerCourse();
		}
		//	2. quit: which ends the program with an appropriate message.
		else if(choice ==2) {
			System.out.println("Goodbye");
		}
		else {
			System.out.println("Wrong choice please, restart the app and try again");
		}
	} 
	
	int menu() {
		/*-This method displays and prompts the user to select one of the following with the  option:
		
		1. Student: This allows the user to enter his/her email and password and check whether or not those credentials are valid, in order to log in. If the credentials are invalid the program should end with an appropriate message to the student.*/
		int choice = 0;
		try {
		System.out.println("******************************************    Welcome to School Management System    ****************************************** \n \n"
				+ "Please choose from the following: \n"
				+ "\t 1. Login \n"
				+ "\t 2. Quit \n");
		choice = scan.nextInt();}
		catch(InputMismatchException e) {
			e.getMessage();
		}
		return choice;
		
	}
	
	void studentLogin() {	
			System.out.println("Enter your email");
			String email = scan.next().trim();
			System.out.println("Enter your password");
			String password = scan.next().trim();
			try {
			if(stService.validateStudent(email, password)) {
				/*			If the credentials are valid, the student is logged in and all the classes the Student is registered to should be displayed. Displays and prompt the student to select one of the following two additional numeric (1 or 2) options that are available: * 
				 */
				st = stService.getStudentByEmail(email);
				System.out.println("Welcome, " + st.getsName());
				System.out.println();
				List<Course> stCourses = stService.getStudentCourses(email);
				if(stCourses.size()>0) {
					System.out.println("You are registered to : ");
					System.out.printf("%30s %1s %30s %1s %30s\n","Course ID",'|',"Course Name",'|', "Course Instructor");
					}
				
				for(Course c:stCourses) {
					System.out.printf("%30s %1s %30s %1s %30s\n",c.getcId(),'|',c.getcName(),'|', c.getcInstructorName());
				}

				
			} 
			else {
				System.out.println("Wrong credentials, please try again");
				System.exit(0);
			}
				}
			catch(InputMismatchException e) {
				e.getMessage();
			}
			
	}
	
	void registerCourse() {
		/* *  1) Register to Class: This displays all the courses in the database and allows the student to select a course in which the student wished to be registered. If the Student is already registered in that course, display the message "You are already registered in that course!", otherwise, register the student to that course and save this result in your database. Also, show the updated registered courses list for that student. After that end the program with an appropriate message.
		
				2) Logout: Which ends the program with an appropriate message.
			 */
		List<Course> availableCourses = cService.getAllCourses();
		List<Course> stCourses = stService.getStudentCourses(st.getsEmail());
		availableCourses.removeAll(stCourses);
		
		System.out.println("Welcome to School Management System \n "
				+ "please choose from the following: \n"
				+ " 1. Register to course \n"
				+ " 2. Logout \n");
		
		try {
		int choice = scan.nextInt();
		
		if(choice==1) {
			System.out.println("Please choose from the following courses and type number corresponding to the course: ");
			for(Course c:availableCourses) {
				System.out.printf("%30s %1s %30s %1s %30s\n",c.getcId(),'|',c.getcName(),'|', c.getcInstructorName());
			}

			int cId = scan.nextInt();
			stService.registerStudentToCourse(st.getsEmail(), cId);
			stCourses = stService.getStudentCourses(st.getsEmail());
			System.out.println(st.getsName()+"'s classes");
			System.out.printf("%30s %1s %30s %1s %30s\n","Course ID",'|',"Course Name",'|', "Course Instructor");
			for(Course c:stCourses) {
				System.out.printf("%30s %1s %30s %1s %30s\n",c.getcId(),'|',c.getcName(),'|', c.getcInstructorName());
			}
			registerCourse();
		}
		else {
			System.out.println(st.getsName()+ ", successfully logged out");
			System.exit(0);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Wrong choice please restart the app and try again");
		}
	}
	

}
