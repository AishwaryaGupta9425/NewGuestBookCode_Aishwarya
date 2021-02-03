package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.*;


import com.example.demo.repository.RegisterRepository;

@Service
public class ViewAllGuestService {

	@Autowired
	RegisterRepository registerRepository;
	
	public List<UserModel> getAllGuest(){
		return registerRepository.findAll();
	}
	
}
