package com.NBdiMAN.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
	@Autowired
	@Qualifier("xx")
	private MyDataSource ds;
	
	@Test
	void test() throws Exception {
		System.out.println(ds);
	}
}
