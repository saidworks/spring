package com.saidworks.jobportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class DemoController {
    @RequestMapping("/demo")
    
    //The @ResponseBody annotation tells a controller 
    //that the object returned is automatically serialized 
    //into JSON and passed back into the HttpResponse object.
    
    @ResponseBody

    // Method
    public String helloWorld()
    {

        // Print statement       

       // put your Name Here!!
        return "Hello William Roales!";
    }
}
