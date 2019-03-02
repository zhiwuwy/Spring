package com.NBdiMAN.di_constructor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
	@Autowired
	private Employee2 e2;
	
	@Autowired
	private Person2 p2;
	
	@Autowired
	private CollectionBean2 cb2;
	
	@Test
	void test() throws Exception {
		System.out.println(e2);
		System.out.println(p2);
		System.out.println(cb2);
	}
}
