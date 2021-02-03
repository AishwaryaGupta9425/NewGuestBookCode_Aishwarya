package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserHomeController {
	
	@RequestMapping("/userhome")
	public ModelAndView getUserHome(@RequestParam() String email) {
	ModelAndView mv=new ModelAndView();
	 mv.addObject("user", email);
	 mv.setViewName("UserHome");
	
	 return mv;
	}
	
	
	
}
