package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.UserModel;
import com.example.demo.repository.RegisterRepository;

@Service
public class RegisterService {
	
	@Autowired
	RegisterRepository registerRepository;

	public UserModel getRegsterData(UserModel user) {
		
		return registerRepository.save(user);
			
		
	}
	
	public UserModel verifyEmail(String email) {
		return registerRepository.findByEmail(email);
	}
	
	
}
