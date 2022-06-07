package com.saidworks.jobportal.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;



@Data // This tells Hibernate to make a table out of this class
@Entity

public class User implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Column(name="first_name")
  private String firstName;
  @Column(name="last_name")
  private String lastName;
  @Column(name="email")
  private String email;
  @OneToOne(cascade=CascadeType.ALL)
  @JoinColumn(name="street")
  private Address address;
  

}