package com.NBdiMAN.register.service.impl;

import java.sql.SQLException;

import com.NBdiMAN.register.dao.IUserDAO;
import com.NBdiMAN.register.domain.User;
import com.NBdiMAN.register.service.IUserService;

import lombok.Setter;

public class UserServiceImpl implements IUserService{
	
	@Setter
	private IUserDAO dao;

	public void register(User user) throws SQLException {
		System.out.println("注册操作");
		dao.save(user);
	}
}
