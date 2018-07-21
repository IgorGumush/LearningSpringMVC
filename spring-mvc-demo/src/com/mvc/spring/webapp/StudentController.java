package com.mvc.spring.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create a student object
		Student student = new Student();
		
		// add student object to the model
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	// We bind the student object spring populates data using the setter fields
	public String processForm(@ModelAttribute("student") Student student) {
		
		// Do some logic.
		System.out.println(student.getFirstName() + " " + student.getLastName());
		
		return "student-confirmation";
	}
}
