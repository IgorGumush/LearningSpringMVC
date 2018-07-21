package com.mvc.spring.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HirarhyController {

	// need a controller method to show the HTML form
	@RequestMapping("/showForm")
	public String dispalyForm() {
		return "some-jsp-view";
	}


}
