package com.gdupt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gdupt.dao.UserMapper;
import com.gdupt.entity.User;
@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	@Transactional(propagation= Propagation.REQUIRED)
	public int addUser(User user) {
		int i = userMapper.add(user);
		try{
			
			proccess();
		}catch(Exception e){
			e.printStackTrace();
		}
		return i;
	}
	@Transactional(readOnly = true,propagation = Propagation.REQUIRED)
	public List<User> getUsers() {
		
	
		return userMapper.getUsers();
	}
	@Transactional(readOnly = true,propagation = Propagation.REQUIRED)
	public User getUserByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional(propagation= Propagation.REQUIRED)
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	private int proccess(){
		
		int i = 1/0;
		return i;
	}

}
