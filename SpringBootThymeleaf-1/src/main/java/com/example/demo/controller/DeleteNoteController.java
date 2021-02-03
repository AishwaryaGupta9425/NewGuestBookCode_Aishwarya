package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.DeleteNoteService;
import com.example.demo.service.ViewAllGuestNotesService;

@Controller
public class DeleteNoteController {

	@Autowired
	DeleteNoteService deleteNoteService;
	
	@Autowired
	ViewAllGuestNotesService viewAllGuestNotesService;
	

	@RequestMapping("/deletenote")
	public ModelAndView getAfterNoteDelete(@RequestParam int id) {
		ModelAndView mv=new ModelAndView();
		deleteNoteService.getAfterDelete(id);
		mv.addObject("notes", viewAllGuestNotesService.getAllNotes());
		mv.setViewName("allguestnotes");
		return mv;
	}
	
}
