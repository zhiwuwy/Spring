package com.NBdiMAN.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ContainerTest {
	@Autowired
	private Person person;
	@Autowired
	private BeanFactory factory;
	@Autowired
	private ApplicationContext ctx;
	@Test
	void testApplicationContext() throws Exception {
		System.out.println(person);
		System.out.println(factory);
		System.out.println(ctx);
	}
}
