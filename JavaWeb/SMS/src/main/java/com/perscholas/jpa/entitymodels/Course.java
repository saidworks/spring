package com.perscholas.jpa.entitymodels;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Course implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int cId;
	@Column(name="name")
	private String cName;
	@Column(name="instructor")
	private String cInstructorName;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstructorName() {
		return cInstructorName;
	}

	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cInstructorName=" + cInstructorName + "]";
	}
	@Override
	 public boolean equals(Object object) {
	    	if(object instanceof Course) {
	    		Course c = (Course) object;
	    		if(cId == c.getcId()  && cName.equals(c.getcName()) 
	    				&& cInstructorName.equals(c.getcInstructorName())) {
	    					return true;
	    		}
	    	}
	    	return false;
	    }

}
