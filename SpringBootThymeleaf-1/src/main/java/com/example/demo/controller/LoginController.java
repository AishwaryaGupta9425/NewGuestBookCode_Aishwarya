package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.UserModel;
import com.example.demo.service.LoginService;


@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@RequestMapping("/guestlogin")
	public String getLogin() {
		return "Login";
	}
	
	
	@RequestMapping("/loginaction")
	public ModelAndView getLoginData(@ModelAttribute UserModel user) {
		if(loginService.verifyLogin(user.getEmail(),user.getPassword())!=null) {
		ModelAndView mv=new ModelAndView();
		 mv.addObject("user", user.getEmail());
		 mv.setViewName("UserHome");
		
		return mv;
	
		}else {
			ModelAndView mv=new ModelAndView();
			 mv.addObject("message", "Invalid UserName or Password...!!!");
			 mv.setViewName("login");
			return mv;	
		}
	}
	
	
}
