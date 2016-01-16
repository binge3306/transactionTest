package com.gdupt.service;

import java.util.List;

import com.gdupt.entity.User;

public interface UserService {
	
	public int addUser(User user);
	
	public List<User> getUsers();
	
	public User getUserByID(int id );
	
	public int updateUser(User user);
	

}
