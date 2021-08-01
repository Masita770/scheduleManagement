package com.example.config.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.config.domain.UserInfo;
import com.example.config.repository.UserRepository;
import com.example.config.mapper.UserMapper;


@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	//*次回はここから
	public List<UserInfo> searchAll() {
		return userRepository.findAll();
	}
	
	public void addAccount(UserInfo userInfo) {
		userRepository.save(userInfo);
	}
	
	public UserInfo findById(Integer id) {
		Optional<UserInfo> updateUserInfo = userRepository.findById(id);
		return updateUserInfo.get();
	}
}

