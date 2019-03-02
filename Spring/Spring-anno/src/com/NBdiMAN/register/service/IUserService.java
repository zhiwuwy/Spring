package com.NBdiMAN.register.service;

import java.sql.SQLException;

import com.NBdiMAN.register.domain.User;

public interface IUserService {
	void register(User user) throws SQLException;
}
