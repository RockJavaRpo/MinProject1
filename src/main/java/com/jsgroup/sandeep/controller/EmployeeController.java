package com.jsgroup.sandeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jsgroup.sandeep.model.Employee;
import com.jsgroup.sandeep.service.IEmployeeService;

@Controller
public class EmployeeController {
  @Autowired
	private IEmployeeService service;
    //1. show Register page
     public String showReg()
     {
    	 return "register";
     }
     
   //2. Save Employee Data
 	@PostMapping("/save")
 	public String saveEmp(
 			@ModelAttribute Employee employee,
 			Model model) 
 	{
 		//call service layer
 		Integer eid = service.saveEmployee(employee);
 		String message = " Employee '"+eid+"' saved ";
 		model.addAttribute("msg", message);
 		return "EmployeeReg";
 	}
     
}
