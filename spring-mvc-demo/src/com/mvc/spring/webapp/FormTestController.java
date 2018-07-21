package com.mvc.spring.webapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// High level mapping - all the other relative to this form.
@RequestMapping("hello")
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
	
	// new controller nethod to read data
	// add data to the model
	@RequestMapping("/processFormV2")
	public String letsShout(HttpServletRequest request, Model model) {
		
		//Read the request from the form
		String theName = request.getParameter("username");
		
		// Manipulate data
		theName = theName.toUpperCase();
		
		// add msg to the model , can be any name
		// We access the attribute by ${<attribute name>} on the View screen
		model.addAttribute("username_upper", theName);
		
		return "helloUser";
	}
	
	// new controller nethod to read data
	// add data to the model
	@RequestMapping("/processFormV3")
	public String processFormV3(
			// Binding param instead of using a request
			@RequestParam("username") String username,			
			Model model) {
		
		//Read the request from the form
		//String theName = request.getParameter("username");
		
		// Manipulate data
		username = username + " my man";
		
		// add msg to the model , can be any name
		// We access the attribute by ${<attribute name>} on the View screen
		model.addAttribute("username_upper", username);
		
		return "helloUser";
	}
	
	
}
