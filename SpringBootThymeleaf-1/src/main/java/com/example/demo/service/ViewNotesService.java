package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.guestbook;
import com.example.demo.repository.GuestRepository;

@Service
public class ViewNotesService {

	@Autowired
	GuestRepository guestRepository;
	
	public List<guestbook> getMyNotes(String email) {
		
	
		return guestRepository.findByEmail(email);
		
	}
	
}
