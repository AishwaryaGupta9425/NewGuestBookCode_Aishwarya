package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.ViewNotesService;

@Controller
public class ViewNotesController {

	@Autowired
	ViewNotesService viewNoteService;
	
	@RequestMapping("/viewnotes")
	public ModelAndView getViewNotesPage(@RequestParam() String email) {
		ModelAndView mv=new ModelAndView();
		if(viewNoteService.getMyNotes(email)!=null) {
		mv.addObject("user",viewNoteService.getMyNotes(email));
		mv.addObject("user2",email);
		mv.setViewName("MyNotes");
		return mv;
		}else {
			System.out.println("executing empty");
			ModelAndView mv1=new ModelAndView();
			mv1.addObject("user",email);
			mv1.setViewName("EmptyNotes");
			return mv1;
		}
	}
	
	
	
}
