package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;


import com.example.demo.service.ViewAllGuestNotesService;

@Controller
public class ViewAllGuestNotesConroller {

	@Autowired
	ViewAllGuestNotesService viewAllGuestNotesService;
	
	@RequestMapping("/allguestnotes")
	public ModelAndView getAllNotes() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("notes", viewAllGuestNotesService.getAllNotes());
		mv.setViewName("allguestnotes");
		return mv;
		
	}
	
	
	
}
