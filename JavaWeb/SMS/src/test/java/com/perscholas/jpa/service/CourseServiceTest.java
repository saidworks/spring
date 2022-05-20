package com.perscholas.jpa.service;

import static org.junit.Assert.*;

import org.junit.Test;



public class CourseServiceTest {

	@Test
	public void testGetAllCourses() {
		CourseService cService = new CourseService();
		assertNotNull(cService.getAllCourses());
		assertTrue(cService.getAllCourses().size()>1);
	}

}
