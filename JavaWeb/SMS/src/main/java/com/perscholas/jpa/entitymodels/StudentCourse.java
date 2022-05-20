package com.perscholas.jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="student_course")
public class StudentCourse {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
