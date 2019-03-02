package com.NBdiMAN.di_setter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {

	@Autowired
	private Employee1 employee1;
	
	@Autowired
	private Person1 person1;
	
	@Autowired
	private CollectionBean1 cb1;
	
	@Test
	void testIoC() throws Exception {
		System.out.println(employee1);
		System.out.println(person1);
    	System.out.println(cb1);
	}
}
