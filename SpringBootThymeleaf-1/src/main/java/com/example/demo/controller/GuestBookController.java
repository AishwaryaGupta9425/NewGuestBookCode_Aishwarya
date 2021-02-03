package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.guestbook;
import com.example.demo.service.GuestBookService;

@Controller
public class GuestBookController {

	@Autowired
	GuestBookService guestBookService;
	
	
	@RequestMapping("/dataaction")	
	public ModelAndView saveGuestBook(guestbook guest) {
		ModelAndView mv=new ModelAndView();
		guestBookService.saveGuestData(guest);
		mv.addObject("user", guest.getEmail());
		mv.addObject("message","Note Added Successfully");
		mv.setViewName("userhome");
		return mv;
	}
}
