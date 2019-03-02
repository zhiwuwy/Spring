package com.NBdiMAN.xml_autowired;

//需求:让Spring帮我创建Person对象,而Person对象还需要依赖Dog对象
public class Person {
	private Dog dog;
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Person [dog=" + dog + "]";
	}
	
}
