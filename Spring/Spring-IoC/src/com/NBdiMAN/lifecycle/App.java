package com.NBdiMAN.lifecycle;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.*;
import static org.junit.jupiter.api.DynamicTest.*;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
	//没有Spring之前
	@Test
	void testOld() throws Exception {
		//创建对象
		MyDataSource ds = new MyDataSource();
		//立马对对象做初始化操作
		ds.open();
		
		ds.doWork();
	
		//在销毁之前执行扫尾操作
		ds.close();
	}
	
	//有Spring之后
	@Autowired
	private MyDataSource ds;
	
	@Test
	void testIoC() throws Exception {
		ds.doWork();
	}
	
}
