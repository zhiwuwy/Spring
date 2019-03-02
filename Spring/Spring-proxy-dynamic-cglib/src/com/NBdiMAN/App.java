package com.NBdiMAN;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.NBdiMAN.domain.Employee;
import com.NBdiMAN.service.impl.EmployeeServiceImpl;
import com.NBdiMAN.tx.TransactionManagerAdvice;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private TransactionManagerAdvice advice;
	
	//CGLIB代理对象：com.NBdiMAN.service.impl.EmployeeServiceImpl$$EnhancerByCGLIB$$5492909f
	@Test
	void testSave() throws Exception {
		
		EmployeeServiceImpl proxy = advice.getProxyObject();
		//System.out.println(proxy.getClass());
		proxy.save(new Employee());
	}
	
	@Test
	void testUpdate() throws Exception {
		EmployeeServiceImpl proxy = advice.getProxyObject();
		proxy.update(new Employee());
	}
}
