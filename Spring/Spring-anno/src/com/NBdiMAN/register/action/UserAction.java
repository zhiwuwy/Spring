package com.NBdiMAN.register.action;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.NBdiMAN.register.domain.User;
import com.NBdiMAN.register.service.IUserService;

//模拟struts2的Action或SpringMVC的Controller 
@Controller
public class UserAction {
	
	@Autowired
	private IUserService userService;
	public String execute() throws SQLException {
		System.out.println("注册请求");
		userService.register(new User());
		return "success";
	}
}
