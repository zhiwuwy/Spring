package com.NBdiMAN.tx;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import lombok.Setter;

//事务的增强操作-CGLIB
@SuppressWarnings("all")
public class TransactionManagerAdvice implements InvocationHandler{
	
	@Setter
	private Object target;//真实对象（对谁做增强）
	@Setter
	private TransactionManager txManager;
	
	//创建一个代理对象
	public <T> T getProxyObject() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());//设置代理对象的父类（被增强）
		enhancer.setCallback(this);//设置增强的对象
		return (T) enhancer.create();//创建代理对象
	}
	
	//如何为真实对象的方法做增强的具体操作
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//System.out.println(proxy.getClass());
		//System.out.println(method);
		//System.out.println(args);
		txManager.begin();
		Object ret = null;
		try {
			//------------------------------------------------------------
			ret = method.invoke(target, args);
			//------------------------------------------------------------
			txManager.commit();
		}catch (Exception e) {
			e.printStackTrace();
			txManager.rollback();
		}
		return ret;
	}
}
