package com.NBdiMAN.springtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//SpringTest案例的测试

//运行Spring的JUnit5
@SpringJUnitConfig
public class SpringTestTest {
	@Autowired
	private SomeBean bean;
	@Test
	void testIoC() throws Exception {
		bean.doWork();
	}
}
