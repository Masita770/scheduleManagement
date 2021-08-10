package com.example.config.service;

import java.util.List;
import java.util.Optional;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.config.domain.UserInfo;
import com.example.config.repository.UserRepository;
import com.example.config.mapper.UserMapper;


@Service
@Transactional
@MapperScan
public class UserService {
	private  UserMapper userMapper;
	
	@Autowired
	UserRepository userRepository;
	//*次回はここから
	public List<UserInfo> searchAll() {
		return userRepository.findAll();
	}
	
	public void insert(UserInfo userInfo) {
		userRepository.save(userInfo);
	}
	
	public UserInfo findById(Integer id) {
		Optional<UserInfo> updateUserInfo = userRepository.findById(id);
		return updateUserInfo.get();
	}
}

