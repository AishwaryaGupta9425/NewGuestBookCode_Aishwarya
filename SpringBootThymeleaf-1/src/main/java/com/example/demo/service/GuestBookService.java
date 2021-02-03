package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.guestbook;
import com.example.demo.repository.GuestRepository;

@Service
public class GuestBookService {

	
	@Autowired
	GuestRepository guestRepository;
	
	public guestbook saveGuestData(guestbook guest) {
		return guestRepository.save(guest);
	}
	
}
