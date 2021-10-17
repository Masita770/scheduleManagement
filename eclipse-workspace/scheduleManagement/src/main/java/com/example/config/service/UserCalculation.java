package com.example.config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.config.domain.UserInformation;
import com.example.config.repository.UserRepository;


@Service
public class UserCalculation {
	
	@Autowired
	public UserRepository userRepository;
	//*次回はここから
	public List<UserInformation> searchAll() {
		return userRepository.findAll();
	}
	
	public void addAccount(UserInformation userInformation) {
		userRepository.save(userInformation);
	}
}
