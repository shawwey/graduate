package com.shaw.cn.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shaw.cn.dao.UserDao;
import com.shaw.cn.entity.User;
import com.shaw.cn.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}	

}
