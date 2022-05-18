package com.perscholas.jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_course")
public class StudentCourse {
	@Id
	@Column(name="Student_email")
	private String stEmail;
	@Column(name="sCourses_id")
	private int stCourseId;
	public StudentCourse() {
		
	}
	public String getStEmail() {
		return stEmail;
	}
	public void setStEmail(String stEmail) {
		this.stEmail = stEmail;
	}
	public int getStCourseId() {
		return stCourseId;
	}
	public void setStCourseId(int stCourseId) {
		this.stCourseId = stCourseId;
	}
	
}
