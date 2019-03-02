package com.NBdiMAN.tx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import lombok.Setter;

//事务的增强操作
@SuppressWarnings("all")
public class TransactionManagerAdvice implements InvocationHandler{
	
	@Setter
	private Object target;//真实对象（对谁做增强）
	@Setter
	private TransactionManager txManager;
	
	//创建一个代理对象
	public <T> T getProxyObject() {
		return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),//类加载器，一般是真实对象的类加载器，用反射方式得到
				target.getClass().getInterfaces(),//真实对象实现的接口的数组，也可以用反射方式得到
				this);//如何做事务增强的对象，需要实现InvocationHandler接口
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
