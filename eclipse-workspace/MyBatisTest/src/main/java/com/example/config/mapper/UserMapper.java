package com.example.config.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.example.config.domain.UserInfo;

@Mapper
public interface UserMapper {
	List<UserInfo> findAll();
	UserInfo get(@Param("id") Integer id);
	int insert(@Param("userInfo") UserInfo userInfo);
	int update(@Param("userInfo") UserInfo userInfo);

}
