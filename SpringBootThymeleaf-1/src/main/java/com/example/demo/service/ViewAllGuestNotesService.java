package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.*;
import com.example.demo.repository.GuestRepository;
@Service
public class ViewAllGuestNotesService {

	
	@Autowired
	GuestRepository guestRepository;
	
	public List<guestbook> getAllNotes(){
		
		return guestRepository.findAll();
	}
	
}
