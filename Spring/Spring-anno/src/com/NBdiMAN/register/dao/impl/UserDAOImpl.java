package com.NBdiMAN.register.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.NBdiMAN.register.dao.IUserDAO;
import com.NBdiMAN.register.domain.User;

import lombok.Cleanup;
import lombok.SneakyThrows;

@Repository
public class UserDAOImpl implements IUserDAO{
	
	@Autowired
	private DataSource dataSource;
	@SneakyThrows
	public void save(User u){
		System.out.println("保存操作");
		@Cleanup
		Connection conn = dataSource.getConnection();
		String sql = "INSERT INTO user (username, password) VALUES(?,?)";
		@Cleanup
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, u.getUsername());
		ps.setString(2, u.getPassword());
		ps.executeUpdate();
		
	}
}
