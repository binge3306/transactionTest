package com.gdupt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gdupt.dao.UserMapper;
import com.gdupt.entity.User;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;
	
	@Resource
	private TestUpate testUpate;

	@Transactional(value="transactionManager",propagation= Propagation.REQUIRED)
	public int addUser(User user) {
		proccess();

			int i = userMapper.add(user);
			//return i;
			throw new RuntimeException();
		
	
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
	@Transactional(value = "transactionManager",propagation= Propagation.REQUIRED)
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}
	@Transactional(value = "transactionManager444",propagation = Propagation.REQUIRES_NEW)
	public  int proccess(){
		User u = new User();
		u.setId(11);
		u.setName("修改999");
		u.setPassword("3306");
		int i = userMapper.updateUser(u);
		return i;
	}


}
