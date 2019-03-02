package com.NBdiMAN.bean_tag_inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
	@Autowired
	private SomeBean1 sb1;
	
	@Autowired
	private SomeBean2 sb2;
	
	@Test
	void test() throws Exception {
		System.out.println(sb1);
		System.out.println(sb2);
	}
}
