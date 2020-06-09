package com.chinasoft.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.pojo.User;
import com.chinasoft.service.impl.UserMapperServiceImpl;

@Controller
@RequestMapping("/user")
public class UserMapperController {

	@Autowired
	UserMapperServiceImpl service;
	
	@RequestMapping(value="/addUser",method= RequestMethod.GET)
	@ResponseBody
	public Object Insert(String username,String password,String groupId) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setGroupId(groupId);
		user.setCreatedDate(new Date());
		service.insert(user);
		Map<String,Object> rs = new HashMap<>(64);	
        rs.put("data",user);
        rs.put("error_code",0);
        return rs;
	}
	
	@RequestMapping(value="/delete",method= RequestMethod.GET)
	@ResponseBody
	public Object Delete(String user_id) {
		int gruopId=service.getGroupId(Integer.parseInt(user_id));
		service.delete(Integer.parseInt(user_id));
		Map<String,Object> rs = new HashMap<>(64);
		rs.put("gruop_id",gruopId);
		rs.put("message","数据删除成功");
		rs.put("error_code",0);       
        return rs;
	}
	
	@RequestMapping(value="/selectUser",method= RequestMethod.GET)
	@ResponseBody
	public Object Select(String position,String user_id,String idCardNo,String name,String department) {
		User user = new User();
		user.setPosition(position);
		user.setUser_id(Integer.parseInt(user_id));
		user.setIdCardNo(idCardNo);
		user.setName(name);
		user.setDepartment(department);
		List<User> users =service.select(user);
		Map<String,Object> rs = new HashMap<>(64);
        rs.put("data",users);
		rs.put("error_code",0);
        return rs;
	}
	
	@RequestMapping(value="/update",method= RequestMethod.GET)
	@ResponseBody
	public Object Update(User user) {
		service.update(user);
		Map<String,Object> rs = new HashMap<>(64);
		rs.put("data",user);
		rs.put("error_code",0);
        return rs;
	}
}
