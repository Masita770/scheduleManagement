package com.example.config.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

import com.example.config.domain.UserInfo;

@Mapper
@MapperScan
public interface UserMapper {
	List<UserInfo> findAll();
	UserInfo get(@Param("id") Integer id);
	int insert(@Param("userInfo") UserInfo userInfo);
	int update(@Param("userInfo") UserInfo userInfo);

}
