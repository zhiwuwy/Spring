package com.NBdiMAN;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.NBdiMAN.domain.Employee;
import com.NBdiMAN.service.IEmployeeService;

@SpringJUnitConfig
public class App {
	@Autowired
	private IEmployeeService employeeService;
	
	@Test
	void testSave() throws Exception {
		System.out.println(employeeService.getClass());
		employeeService.save(new Employee());
	}
	
	@Test
	void testUpdate() throws Exception {
		employeeService.update(new Employee());
	}
}
