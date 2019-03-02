package com.NBdiMAN.container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	//使用BeanFactory
	/*
 		结论:BeanFactory有延迟加载的特点,在创建Spring容器的时候,不会立马创建容器中的管理的Bean对象,而是
 			要等到从容器中获取对象(getBean())的时候,才去创建对象
 	
		-----------------------------------------
  		构建Person........
	 */
	@Test
	void testBeanFactory() throws Exception {
		
		Resource resource = new ClassPathResource("com/NBdiMAN/container/ContainerTest-context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("-----------------------------------------");
		Person person = factory.getBean("person", Person.class);
		
	}
	//使用ApplicationContext
	/*
	 	结论:创建Spring容器的时候,就会把Spring容器中管理的Bean对象立马初始化,而不会等到获取bean对象的时候再创建
	 	
	  	构建Person........
		-----------------------------------------
	 */
	@Test
	void testApplicationContext() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/NBdiMAN/container/container.xml");
		System.out.println("-----------------------------------------");
		//Person person = ctx.getBean("person", Person.class);
	}
}
