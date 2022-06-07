package com.saidworks.jobportal.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelAndViewController {
	@GetMapping("/showViewPage")
	   public String passParametersWithModel(Model model) {
	       model.addAttribute("message", "Perscholas");
	       model.addAttribute("welcomeMessage", "welcome");
	       int i = 10;
	       model.addAttribute("number", i);

	       List<String> list = Arrays.asList("one", "two");
	       model.addAttribute("listData", list);
	       return "viewPage";
	   }

}
