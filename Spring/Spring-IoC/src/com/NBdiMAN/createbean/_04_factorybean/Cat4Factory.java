package com.NBdiMAN.createbean._04_factorybean;

import org.springframework.beans.factory.FactoryBean;

public class Cat4Factory implements FactoryBean<Cat4>{
	
	private String username;
	
	
	//实例工厂的方法:
	public Cat4 getObject() throws Exception {
		System.out.println(username);
		Cat4 cat4 = new Cat4();
		//TODO
		return cat4;
	}

	@Override
	public Class<?> getObjectType() {
		return Cat4.class;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
