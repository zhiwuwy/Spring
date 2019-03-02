package com.NBdiMAN.xml_autowired;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private Person person;
	
	@Test
	void testPerson() throws Exception {
		System.out.println(person);

	}
}
