package com.perscholas.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacherm")

public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int tId;
	@Column(name="salary")
	private String salary;
	@Column(name="teacher_name")
	private String name;
	
	 @ManyToOne(cascade=CascadeType.MERGE, targetEntity=Department.class)
	 @JoinColumn(name = "dept_id")
	 private Department department;
	public Teacher(int tId, String salary, String name) {
		super();
		this.tId = tId;
		this.salary = salary;
		this.name = name;
	}
	
	public Teacher( String salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	
	
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}


}
