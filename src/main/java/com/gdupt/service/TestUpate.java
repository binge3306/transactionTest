package com.gdupt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gdupt.dao.UserMapper;
import com.gdupt.entity.User;

@Service
public class TestUpate {
	@Resource
	private UserMapper userMapper;
	@Transactional(value = "transactionManager",propagation = Propagation.REQUIRES_NEW)
	public  int proccess(){
		User u = new User();
		u.setId(11);
		u.setName("修改33");
		u.setPassword("3306");
		int i = userMapper.updateUser(u);
		return i;
	}

}
