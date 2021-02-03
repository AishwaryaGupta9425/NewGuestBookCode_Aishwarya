package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminHomeController {
	@RequestMapping("/adminhome")
	public ModelAndView getUserHome() {
	ModelAndView mv=new ModelAndView();
	
	 mv.setViewName("adminhome");
	
	 return mv;
	}
}
