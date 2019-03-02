package com.NBdiMAN.register;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.NBdiMAN.register.action.UserAction;
import com.NBdiMAN.register.domain.User;

@SpringJUnitConfig
public class App {
	@Autowired
	private UserAction userAction;
	
	@Test
	void test() throws Exception {
		userAction.execute();
		
	}
}
