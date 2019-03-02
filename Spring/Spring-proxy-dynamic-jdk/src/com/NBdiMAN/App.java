package com.NBdiMAN;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.NBdiMAN.domain.Employee;
import com.NBdiMAN.service.IEmployeeService;
import com.NBdiMAN.tx.TransactionManagerAdvice;

@SpringJUnitConfig
public class App {
	@Autowired
	private TransactionManagerAdvice advice;//做事务增强的对象
	
	@Test
	void testSave() throws Exception {
		//获取代理对象 com.sun.proxy.$Proxy19
		IEmployeeService proxy = advice.getProxyObject();
		
		System.out.println(proxy.toString());
		
		proxy.save(new Employee());
	}
	
	@Test
	void testUpdate() throws Exception {
		//获取代理对象 com.sun.proxy.$Proxy19
				IEmployeeService proxy = advice.getProxyObject();
				
				//System.out.println(proxy.getClass());
				
				proxy.update(new Employee());
	}
}
