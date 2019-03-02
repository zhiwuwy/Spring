package com.NBdiMAN.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NBdiMAN.register.dao.IUserDAO;
import com.NBdiMAN.register.domain.User;
import com.NBdiMAN.register.service.IUserService;

import lombok.SneakyThrows;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDAO dao;
	@SneakyThrows
	public void register(User user) {
		System.out.println("注册操作");
		dao.save(user);
	}
}
