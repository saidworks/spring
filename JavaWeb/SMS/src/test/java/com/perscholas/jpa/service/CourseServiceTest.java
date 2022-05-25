package com.perscholas.jpa.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;





public class CourseServiceTest {
	
	CourseService cService;
	@Before 
	public void setUp() {
		cService = new CourseService();
	}
	@After
	public void tearDown() {
		cService = null;
	}
	
	@Test
	public void testGetAllCourses() {
		
		assertNotNull(cService.getAllCourses());
		assertTrue(cService.getAllCourses().size()>1);
	}

}
