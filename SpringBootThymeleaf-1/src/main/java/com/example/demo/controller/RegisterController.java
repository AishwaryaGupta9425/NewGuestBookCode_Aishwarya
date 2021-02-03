package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.UserModel;
import com.example.demo.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	RegisterService registerService;
	
	@RequestMapping("/guestregister")
	public String getRegisterPage() {
		return "register";
	}
	
	
	@RequestMapping("/registeraction")
	public ModelAndView getRegisterData(UserModel user) {
		
		//for checking whether email already exist or not
		if(registerService.verifyEmail(user.getEmail())!=null) {
		
			ModelAndView mv =new ModelAndView();
			mv.addObject("message", "Email Already Exist...!!!");
			mv.setViewName("result");
			return mv;
		
		
	}else {
		if(registerService.getRegsterData(user)!=null) {
			ModelAndView mv =new ModelAndView();
			mv.addObject("message", "Registration successfull...!!!");
			mv.setViewName("result");
			return mv;
		}else {
			ModelAndView mv =new ModelAndView();
			mv.addObject("message", "Registration Failed...!!!");
			mv.setViewName("result");
			return mv;
		}
		
	}
	}
	
	
}
