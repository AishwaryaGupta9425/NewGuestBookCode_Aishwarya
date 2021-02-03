package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.ProfileService;

@Controller
public class MyProfileController {

	@Autowired
	ProfileService profileService;
	
	
	
	@RequestMapping("/myprofile")
	public ModelAndView getProfile(@RequestParam() String email) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("user",profileService.getProfileDetails(email));
		mv.setViewName("myprofile");
		
		
		return mv;
	}
	
}
