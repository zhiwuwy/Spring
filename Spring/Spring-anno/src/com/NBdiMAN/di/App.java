package com.NBdiMAN.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.NBdiMAN.register.action.UserAction;
import com.NBdiMAN.register.domain.User;

@SpringJUnitConfig
public class App {
	@Autowired
	private Person p1;
	
	@Autowired
	private ValueBean vb;
	
	@Test
	void test() throws Exception {
		System.out.println(p1);
		System.out.println(vb);
	}
}
