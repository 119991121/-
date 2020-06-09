package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.User;

public interface UserMapper {
	void insertUser(User user);

	void deleteUser(int user_id);
	
	List<User> selectUser(User user);
	
	void updateUser(User user);

	int getGroupId(int user_id);
	
}
