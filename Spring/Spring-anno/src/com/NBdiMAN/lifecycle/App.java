package com.NBdiMAN.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
	@Autowired
	private SomeBean sb1;
	@Autowired
	private SomeBean sb2;
	
	@Test
	void test() throws Exception {
		System.out.println(sb1);
		System.out.println(sb2);
		sb1.doWork();
	}
}
