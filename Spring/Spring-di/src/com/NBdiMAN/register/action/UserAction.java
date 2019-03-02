package com.NBdiMAN.register.action;

import java.sql.SQLException;

import com.NBdiMAN.register.domain.User;
import com.NBdiMAN.register.service.IUserService;

import lombok.Setter;

//模拟struts2的Action或SpringMVC的Controller 
public class UserAction {
	
	@Setter
	private IUserService userService;
	public String execute() throws SQLException {
		System.out.println("注册请求");
		userService.register(new User());
		return "success";
	}
}
