package com.NBdiMAN.scope;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private Dog dog1;
	@Autowired
	private Dog dog2;
	
	@Test
	void testDog() throws Exception {
		System.out.println(dog1);
		System.out.println(dog2);
	}
}
