package com.NBdiMAN.di;

import javax.annotation.Resource;

public class Person {
	@Resource//Resource不同于Autowire的地方在于先按照名字(对象变量名，下面的cat2)找，再按照类型找,重新设置名字的方法Resource(name="cat2")
	//Autowired
	//@Qualifier("cat2")//按照bean的类型和id去找
	private Cat cat2;

	public String toString() {
		return "Person [cat=" + cat2 + "]";
	}
	
}
