package com.NBdiMAN.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class SomeBean {

	public SomeBean() {
		System.out.println("构建SomeBean对象");
	}
	@PostConstruct//构建对象之后的初始化方法
	public void open() {
		System.out.println("初始化方法");
	}
	@PreDestroy//销毁对象之前执行的方法
	public void close() {
		System.out.println("销毁前扫尾方法");
	}
	
	public void doWork() {
		System.out.println("工作");
	}
}
