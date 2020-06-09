package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.User;
import com.chinasoft.service.UserMapperService;

@Service
public class UserMapperServiceImpl implements UserMapperService {

	@Autowired
	UserMapper mapper;

	@Override
	public void insert(User user) {
		mapper.insertUser(user);
	}
	
	@Override
	public void delete(int user_id) {
		mapper.deleteUser(user_id);
	}
	
	@Override
	public List<User> select(User user) {
		List<User> user1 = mapper.selectUser(user);
		return user1;
	}
	
	@Override
	public void update(User user){
		mapper.updateUser(user);
	}

	@Override
	public int getGroupId(int user_id) {
		int groupId = mapper.getGroupId(user_id);
		return groupId;
	}

}
