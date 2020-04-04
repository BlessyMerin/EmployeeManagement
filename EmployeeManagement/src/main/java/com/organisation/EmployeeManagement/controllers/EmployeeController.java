package com.organisation.EmployeeManagement.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.organisation.EmployeeManagement.entity.Employee;
import com.organisation.EmployeeManagement.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/list")
	public String viewList(Model theModel) {
		List<Employee> employees=service.getAllEmployee();
		theModel.addAttribute("employees",employees);
		return "employee-list";
		
	}
	
	@GetMapping("/showFormForAdd")
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		Employee employee=new Employee();
		theModel.addAttribute("employee", employee);
		return "employee-form";
	}

	/*
	 * @RequestMapping("/saveEmployee")
	 * 
	 * @PostMapping("/saveEmployee") public String
	 * saveEmployee(@Valid @ModelAttribute("employee")Employee theEmployee) {
	 * service.saveEmployee(theEmployee); return "redirect:/employee/list";
	 * 
	 * }
	 */
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee theEmployee,BindingResult bind ) {

		System.out.println(bind);
		if(bind.hasErrors())
		{
			System.out.println(bind);
			return "employee-form";
		}
		else {
	    service.saveEmployee(theEmployee);
	     return "redirect:/employee/list";
		}
	}
	
	
	@RequestMapping("/showFormForUpdate")
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId")int theId,Model theModel) {
		Employee theEmployee=service.getEmployee(theId);
		theModel.addAttribute("employee",theEmployee);
		return "employee-update";
		
	}
	
	@RequestMapping("/delete")
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId")int theId)
	{
		service.deleteEmployee(theId);
		return "redirect:/employee/list";
	}
	
	
	@PostMapping("/search")
	public String searchEmployee(@RequestParam("id") int theId,Model theModel) {

		Employee emp = service.getEmployee(theId);
		if (emp == null) {
			theModel.addAttribute("id", theId);
			return "search-error";
		} else {
			List<Employee> empList = service.findEmployee(theId);
			System.out.println(empList);
			theModel.addAttribute("employee", empList);

			return "search-display";
		}

	}
	


}

