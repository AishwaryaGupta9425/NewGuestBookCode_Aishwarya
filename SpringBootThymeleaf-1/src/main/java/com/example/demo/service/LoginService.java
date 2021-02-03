package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.LoginRepository;


@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public UserModel verifyLogin(String email,String password) {
		return loginRepository.findByEmailAndPassword(email, password);
		}
	
	public List<UserModel> getAllDetails(){
		
		return loginRepository.findAll();
	}
	
	public void getAfterDelete(int id){
		
		loginRepository.deleteById(id);
	}
	
}
