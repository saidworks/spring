package com.saidworks.jobportal.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saidworks.jobportal.model.Address;
import com.saidworks.jobportal.model.User;
import com.saidworks.jobportal.repository.AddressRepository;
import com.saidworks.jobportal.repository.HelloRepository;
@Service
public class HelloService {
		@Autowired
		private AddressRepository addressRepo;
		@Autowired
		private HelloRepository repository;
		
	 public User getUser(int id ) {
		// Search
		Map<String, Object> map = repository.findById(id);
		// Get value from Map
		int userId = (int)map.get("id");
		String firstName = (String) map.get("first_name");
		String lastName = (String) map.get("last_name");
		String email = (String) map.get("email");
		String street = (String) map.get("street" );
		// Set the user class to a value
		User user = new User();
		user.setId(userId );
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		Optional<Address> addressOp = addressRepo.findById(street);
		Address address = addressOp.get();
		user.setAddress(address);
		return user ;
		}
	
}
