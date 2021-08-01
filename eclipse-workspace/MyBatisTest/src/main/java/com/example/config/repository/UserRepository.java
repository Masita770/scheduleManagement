package com.example.config.repository;


//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.config.domain.UserInfo;
import com.example.config.mapper.UserMapper;

@Repository
public class UserRepository {
	
	private UserMapper userMapper;
	
	public List<UserInfo> findAll() {
		return userMapper.findAll();
	}
	
	public UserInfo get(Integer id) {
		return userMapper.get(id);
	}
	
	public int create(UserInfo userInfo) {
		return userMapper.insert(userInfo);
	}
	
	public int update(UserInfo userInfo) {
		return userMapper.update(userInfo);
	}
}
