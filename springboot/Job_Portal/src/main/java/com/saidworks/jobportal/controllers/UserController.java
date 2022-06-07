package com.saidworks.jobportal.controllers;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saidworks.jobportal.model.User;

@RestController
public class UserController {
		@PostMapping(value="/users", produces=MediaType.APPLICATION_JSON_VALUE)
	   public void printData(@RequestBody User user) {
	       System.out.println("Printing the user data:"+user);
	   }

}
