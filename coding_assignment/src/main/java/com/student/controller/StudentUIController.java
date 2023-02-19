package com.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.entity.Student;
import com.student.repo.StudentRepo;

@Controller
public class StudentUIController {

	@Autowired
	private StudentRepo sRepo;
	
	
	
	@GetMapping("/home")
	public String homeLauncher() {
		
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showDetail(Model model) {
		
		Student student = new Student();
		model.addAttribute("student",student);
		
		return "welcome"; 
	}

	@PostMapping("/register")
  public String addDetail(@ModelAttribute("student") Student student){
	
	System.out.println(student);
		
		return "result"; 
	}
	
	@GetMapping("/getAllStudents")
	public String getAllStudents(Model model ){
	 Iterable<Student> itr= sRepo.findAll();
	 
	 List<Student> students= new ArrayList<>();
	 itr.forEach(students::add);
	 
	 model.addAttribute("mydata", students);
	 
	 return "result";
	 
	}
	
	
}
