package com.saidworks.jobportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data // This tells Hibernate to make a table out of this class
@Entity
public class Address {
	  @Id
	  private String street;
	  private String city;
	  private String country;
}
