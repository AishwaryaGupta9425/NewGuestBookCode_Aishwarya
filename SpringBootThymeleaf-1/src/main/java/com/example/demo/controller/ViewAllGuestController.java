package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.ViewAllGuestService;

@Controller
public class ViewAllGuestController {

	@Autowired
	ViewAllGuestService viewAllGuestService;
	
	@RequestMapping("/allguest")
	public ModelAndView getViewALlGuest() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("data",viewAllGuestService.getAllGuest());
		mv.setViewName("allguest");
		return mv;
	}
	
	
	
	
}
