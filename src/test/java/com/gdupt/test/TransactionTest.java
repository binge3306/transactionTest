package com.gdupt.test;


import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gdupt.dao.UserMapper;
import com.gdupt.entity.User;
import com.gdupt.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TransactionTest {
	static Logger log = Logger.getLogger(TransactionTest.class);
	@Resource
	private UserService userService;
	
	
	@Test
	public void testList() {
		List<User> list = userService.getUsers();
		
		for (User user : list) {
			log.info(user);
		}
		
	}
	
	@Test
	public void testAdd() {
		User u = new User();
		u.setName("测试");
		u.setPassword("5354");
		int i = userService.addUser(u);
		log.info(i);
		
	}

}
