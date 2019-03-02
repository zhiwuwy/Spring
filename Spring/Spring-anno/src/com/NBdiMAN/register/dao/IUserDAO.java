package com.NBdiMAN.register.dao;

import java.sql.SQLException;

import com.NBdiMAN.register.domain.User;

public interface IUserDAO {
	
	void save(User u) throws SQLException;
}
