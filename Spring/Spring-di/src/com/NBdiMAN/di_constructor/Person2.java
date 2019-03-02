package com.NBdiMAN.di_constructor;

public class Person2 {
	private Cat2 c2;
	
	

	public Person2(Cat2 c2) {
		this.c2 = c2;
	}



	@Override
	public String toString() {
		return "Person1 [c2=" + c2 + "]";
	}
	
	
}
