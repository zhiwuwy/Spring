package com.NBdiMAN.lifecycle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Cleanup;

public class LifeCycleTest {
	//方式1:使用ClassPathXmlApplicationContext对象的close方法关闭资源
	@Test
	void test1() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/NBdiMAN/lifecycle/App-context.xml");
		MyDataSource ds = ctx.getBean("myDataSource", MyDataSource.class);
		ds.doWork();
		ctx.close();
	}
	
	//方式2:使用lombok的@Cleanup注解
	@Test
	void test2() throws Exception {
		@Cleanup
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/NBdiMAN/lifecycle/App-context.xml");
		MyDataSource ds = ctx.getBean("myDataSource", MyDataSource.class);
		ds.doWork();
		
	}
	
	//方式3:使用ClassPathXmlApplicationContext对象的registerShutdownHook()方法,将Spring线程作为JVM的子线程
	@Test
	void test3() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/NBdiMAN/lifecycle/App-context.xml");
		MyDataSource ds = ctx.getBean("myDataSource", MyDataSource.class);
		ds.doWork();
		ctx.registerShutdownHook();
	}
}
