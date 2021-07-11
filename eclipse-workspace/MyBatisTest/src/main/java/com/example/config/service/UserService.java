package com.example.config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.config.domain.UserInfo;
import com.example.config.repository.UserRepository;


@Service
public class UserService {
	
	
	@Autowired
	public UserRepository userRepository;
	//*次回はここから
	public List<UserInfo> searchAll() {
		return userRepository.findAll();
	}
	
	public void addAccount(UserInfo userInfo) {
		userRepository.create(userInfo);
	}
}

