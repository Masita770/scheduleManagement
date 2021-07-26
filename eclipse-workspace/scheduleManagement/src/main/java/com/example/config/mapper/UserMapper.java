package com.example.config.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.example.config.domain.UserInformation;

@Mapper
public interface UserMapper {
	List<UserInformation> findAll();
	UserInformation get(@Param("id") Integer id);
	int insert(@Param("userInformation") UserInformation userInformation);

}
