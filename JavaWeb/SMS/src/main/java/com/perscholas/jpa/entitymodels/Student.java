package com.perscholas.jpa.entitymodels;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="email")
	private String sEmail;
	@Column(name="name")
	private String sName;
	@Column(name="password")
	private String sPass;
	
	@ManyToMany(targetEntity = Course.class,fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Course> sCourses;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}



	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

	@Override
	public String toString() {
		return "Student [sEmail=" + sEmail + ", sName=" + sName + ", sPass=" + sPass + ", sCourses=" + sCourses + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(sCourses, sEmail, sName, sPass);
	}



	@Override
	 public boolean equals(Object object) {
	    	if(object instanceof Student) {
	    		Student i = (Student) object;
	    		if(sEmail.equals(i.getsEmail()) && sName.equals(i.getsName()) 
	    				&& sCourses.size() == i.getsCourses().size()) {
	    					return true;
	    		}
	    	}
	    	return false;
	    }

}
