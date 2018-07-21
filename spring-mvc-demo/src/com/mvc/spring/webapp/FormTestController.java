package com.mvc.spring.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormTestController {
	
	// need a controller method to show the HTML form
	@RequestMapping("/showForm")
	public String showFrom() {
		return "some-test-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloUser";
	}
}
