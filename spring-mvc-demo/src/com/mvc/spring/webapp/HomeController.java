package com.mvc.spring.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Telling spring that its and MVC Controller.
// @Controller Extends from @Component 
@Controller
public class HomeController {
	
	//Should handle all type of http GET/POST requests
	@RequestMapping("/")
	public String showPage() {
		//return the page name (spring would add the prefix and postfix 
		// as described in the servlet xml)
		return "main-menu";
	}
	
	
	
}
