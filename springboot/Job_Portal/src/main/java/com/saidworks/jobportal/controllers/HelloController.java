//package com.saidworks.jobportal.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.saidworks.jobportal.model.User;
//import com.saidworks.jobportal.service.HelloService;
//
//
////learning controller 
//@Controller
//public class HelloController {
//	
//	@Autowired
//	private HelloService service;
//	
//	@GetMapping("/")
//	public String getHello() {
//		return "hello/hello";
//	}
//	
//	@PostMapping("/hello")
//	public String postRequest(@RequestParam("text1") String name,Model model) {
//		model.addAttribute("name",name);
//		
//		return "hello/response";
//	}
//	
//	@PostMapping("/hello/db")
//	public String postDbRequest(@RequestParam("id") int id,Model model) {
//		User user = service.getUser(id);
//		model.addAttribute("user",user);
//		return "hello/db";
//	}
//}
