package com.perscholas.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dept_id")
	private int id;
	@Column(name="dept_name")
	private String name;
	@OneToMany(mappedBy="department",cascade = CascadeType.MERGE)
	private List<Teacher> teacher;
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int id,String name ) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	public Department(String name ) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
