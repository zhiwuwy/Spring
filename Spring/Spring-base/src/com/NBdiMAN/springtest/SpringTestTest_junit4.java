package com.NBdiMAN.springtest;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//SpringTest案例的测试

//运行Spring的JUnit4
@RunWith(SpringJUnit4ClassRunner.class)
//上下文配置对象,主要用来寻找配置文件
//@ContextConfiguration("classpath:com/NBdiMAN/springtest/springtest.xml")
//如果上下文配置对象没有给参数值,默认会从当前类的路径下去找当前类名-context.xml,在这里xml文件名必须为SpringTestTest-context.xml
@ContextConfiguration
public class SpringTestTest_junit4 {
	//表示自动按照类型去Spring容器中找到bean对象,并设置给字段
	@Autowired
	private SomeBean bean;
	
	@org.junit.Test
	public void testIoC() throws Exception {
		bean.doWork();
	}

}
