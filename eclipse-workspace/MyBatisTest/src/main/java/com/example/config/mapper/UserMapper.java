package com.example.config.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.example.config.domain.UserInfo;

@Mapper
public interface UserMapper {
	
	@Insert("INSERT INTO data (id, name, shcedule) VALUES (#{id}, #{name}, #{schedule}")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insertInfo(UserInfo userInfo);
	Optional<UserInfo> findById(Integer id);
	List<UserInfo> selectAll();
	void save(UserInfo userInfo);

}
