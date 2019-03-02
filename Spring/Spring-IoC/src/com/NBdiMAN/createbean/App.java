package com.NBdiMAN.createbean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.NBdiMAN.createbean._01_constructor.Cat1;
import com.NBdiMAN.createbean._02_static_factory.Cat2;
import com.NBdiMAN.createbean._02_static_factory.Cat2Factory;
import com.NBdiMAN.createbean._03_instance_factory.Cat3;
import com.NBdiMAN.createbean._03_instance_factory.Cat3Factory;
import com.NBdiMAN.createbean._04_factorybean.Cat4;

@SpringJUnitConfig
public class App {
	
	@Autowired
	private Cat1 cat1;
	@Autowired
	private Cat2 cat2;
	@Autowired
	private Cat3 cat3;
	@Autowired
	private Cat4 cat4;
	
	//以前创建bean实例的四种方法
	@Test
	void testOld() throws Exception {
		//方式1:通过构造器创建
		Cat1 cat1 = new Cat1();
		//方式2:静态工厂方法
		Cat2 cat2 = Cat2Factory.createInstance();
		//方式3:实例工厂方法
		Cat3 cat3 = new Cat3Factory().createInstance();
		//方式4:FactoryBean实现类工厂,是方式3的变种
		
	}
	
	//通过Spring容器创建bean实例的四种方法
	@Test
	void testOne() throws Exception {
		System.out.println(cat1);//方式1创建的bean实例
		System.out.println(cat2);//方式2创建的bean实例
		System.out.println(cat3);//方式3创建的bean实例
		System.out.println(cat4);//方式4创建的bean实例
	}
	
	
	
	
	
}
