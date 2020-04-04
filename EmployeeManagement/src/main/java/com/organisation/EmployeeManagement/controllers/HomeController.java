package com.organisation.EmployeeManagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.organisation.EmployeeManagement.entity.Admin;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String displayWelcome()
	{
		return "home";
	}
	
	@RequestMapping("/logout")
	public String displaylogout() {
		return "login-failed";
	}
	@RequestMapping("/login")
	public String displaylogin() {
		return "home";
	}
	  @RequestMapping("/success") public String login(@ModelAttribute ("admin")Admin adm)
	  { 
      System.out.println(adm.getUsername());
	  System.out.println(adm.getPassword()); 
	  if(adm.getUsername().equals("admin")
	  && adm.getPassword().equals("admin123"))
		  return "redirect:/employee/list";
	  else return "login-failed"; }
	 
}
