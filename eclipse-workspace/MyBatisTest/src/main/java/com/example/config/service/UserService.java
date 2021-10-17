package com.example.config.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.config.domain.UserInfo;
import com.example.config.mapper.UserMapper;


@Service
//@Transactional
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public List<UserInfo> getList() {
		return userMapper.selectAll();
	}
	
	public void addInfo(UserInfo userInfo) {
		userMapper.save(userInfo);
	}
	
	public UserInfo findById(Integer id) {
		Optional<UserInfo> updateUserInfo = userMapper.findById(id);
		return updateUserInfo.get();
	}
}

