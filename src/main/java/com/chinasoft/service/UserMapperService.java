package com.chinasoft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.pojo.User;

public interface UserMapperService {

	void insert(User user);
	
	void delete(int user_id);
	
	List<User> select(User user);
	
	void update(User user);
	
	int getGroupId(int user_id);
}
