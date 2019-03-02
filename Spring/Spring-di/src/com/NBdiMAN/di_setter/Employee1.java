package com.NBdiMAN.di_setter;

import java.math.BigDecimal;

public class Employee1 {
	private String name;
	private Integer age;
	private BigDecimal salary;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
