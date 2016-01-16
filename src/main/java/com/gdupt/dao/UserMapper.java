package com.gdupt.dao;

import java.util.List;
import java.util.Map;

import com.gdupt.entity.User;

public interface UserMapper {
	
	public List<User> getUsersByPage(Map<String,Object> request);
	
	public List<User> getUsers();
	
	public int add(User user);
	
	public int updateUser(User user);

}
