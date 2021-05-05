package com.example.config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.config.repository.UserRepository;
import com.example.config.domain.UserInformation;


@Service
public class UserCalculation {
	
	@Autowired
	public UserRepository userRepository;
	//*次回はここから
	public List<UserInformation> searchAll() {
		return userRepository.findAll();
		
	}
	
}
