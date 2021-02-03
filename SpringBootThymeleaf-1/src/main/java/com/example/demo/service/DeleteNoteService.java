package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.repository.GuestRepository;


@Service
public class DeleteNoteService {

	@Autowired
	GuestRepository guestRepository;
	
	public void getAfterDelete(int id){
		 guestRepository.deleteById(id);
	}
	
}
