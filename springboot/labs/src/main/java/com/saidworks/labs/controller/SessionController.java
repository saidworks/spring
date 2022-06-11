package com.saidworks.labs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.saidworks.labs.models.User;

@Controller
@SessionAttributes("u")
public class SessionController {
	
	 private final Logger log = LoggerFactory.getLogger(this.getClass());
	 
	  
	   /*
	    * Add user in model attribute
	    */
	   @ModelAttribute("u")
	   public User setUpUserForm() {
	       return new User();
	   }
	
   @GetMapping("/doLogin")
   public String doLogin(@ModelAttribute("u") User u, Model model) {
	      log.info("In session Controller");
          model.addAttribute("FormVar", u);
          return "UserForm";
          // We will create UserForm.html page in next step
       }

   @PostMapping("/Getuser")
   public String userInfo(@ModelAttribute("u") User user, Model model) {
	      log.info("email:" + user.getEmail());
		  log.warn("name" + user.getName());
       System.out.println("Email: " + user.getEmail());
       System.out.println("First Name: " + user.getName());
       System.out.println("Id: " + user.getId());
       model.addAttribute("stu",user);
       return "showData";
  // We will create showData.html page in next step
   }
}

