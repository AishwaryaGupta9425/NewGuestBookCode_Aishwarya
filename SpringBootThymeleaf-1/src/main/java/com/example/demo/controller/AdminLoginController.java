package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminLoginController {

	
	@RequestMapping("/adminlogin")
	public String getAdminLogin() {
		return "adminlogin";
	}
	
	@RequestMapping("/adminloginaction")
	public ModelAndView getAdminHome(@RequestParam String username,String password) {
		ModelAndView mv=new ModelAndView();
		if(username.equals("Admin")&&password.equals("Admin")) {
			
			mv.setViewName("adminhome");
			return mv;
		}else {
			mv.addObject("message", "Admin Login Failed.Please login Again...!!!");
			mv.setViewName("adminlogin");
			return mv;
		}
		
		
	}
	
}
