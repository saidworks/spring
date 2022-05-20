package com.perscholas.jpa.service;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.perscholas.jpa.entitymodels.Course;
import com.perscholas.jpa.entitymodels.Student;

public class StudentServiceTest {
	StudentService stService = new StudentService();
	Student st = new Student("sbowden1@yellowbook.com","Sonnnie Bowden","SJc4aWSU",stService.getStudentCourses("sbowden1@yellowbook.com"));
	
	@Test
	public void testGetAllStudents() {
		
		assertNotNull(stService.getAllStudents());
		assertTrue(stService.getAllStudents().size()>1);
	}

	@Test
	public void testGetStudentByEmail() {
		Student sTest = stService.getStudentByEmail("sbowden1@yellowbook.com");
		assertEquals(st,sTest);
	}

	@Test
	public void testValidateStudent() {
		assertTrue(stService.validateStudent(st.getsEmail(), st.getsPass()));
	}

//	@Test
//	public void testRegisterStudentToCourse() {
//		stService.registerStudentToCourse(st.getsEmail(), 10);
//		//	Check if the account has the same composition.
//		assertThat(newAccount, isA(Account.class));
//		assertEquals(newAccount.getName(), newAcccountInserted.getName());
//	}

	@Test
	public void testGetStudentCourses() {
		List<Course> sCourses = stService.getStudentCourses("sbowden1@yellowbook.com");
		List<Course> stCourses= st.getsCourses();
		assertEquals(sCourses.size(), stCourses.size());
		assertArrayEquals(sCourses.toArray(), stCourses.toArray());
	}

}
