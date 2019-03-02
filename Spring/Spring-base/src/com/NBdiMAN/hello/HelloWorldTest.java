package com.NBdiMAN.hello;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldTest {
	
	//传统方式,正控:调用者手动来创建对象和对象依赖的对象,并组装对象关系
	@Test
	void test1() throws Exception {
		//创建一个对象
		HelloWorld world = new HelloWorld();
		//为当前对象设置相关的依赖属性
		world.setUsername("Agan");
		world.setAge(17);
		world.sayHello();
	}
	
	//使用IoC方式,反向控制
	@Test
	void testIoC() throws Exception {
		HelloWorld world = null;
		//-----------------------------------
		//1.从classpath路径去寻找配置文件去创建一个资源对象
		Resource resource = new ClassPathResource("applicationContext.xml");
		//2.根据资源对象创建Spring IoC容器对象
		BeanFactory factory = new XmlBeanFactory(resource);
		//3.从Spring IoC中获取指定名称(id)的对象,使用getBean方法得到对象有3种方式:
		//签名1:Object getBean(String beanName); //根据bean对象在Spring IoC容器中的名称来获取,缺点是id不能相同
		//world = (HelloWorld) factory.getBean("helloWorld");
		
		//签名2:<T> T getBean(Class<T> requiredType); //根据指定的类型去寻找bean对象,缺点不能有相同类型(class不能相同)
		//world = factory.getBean(HelloWorld.class);
		
		//签名3:<T> T getBean(String name, Class<T> requiredType)//解决了方式1和方式2的缺点,id和class都相同才相同
		world = factory.getBean("helloWorld", HelloWorld.class);
		//-----------------------------------
		world.sayHello();
	}
	
	//模拟Spring IoC容器的操作
	@Test
	void testIoCMock() throws Exception {
		String className = "com.NBdiMAN.hello.HelloWorld";
		HelloWorld world = null;
		//------------------------------------------------
		//使用反射机制创建对象
		Class clzz = Class.forName(className);
		Constructor con = clzz.getConstructor();
		con.setAccessible(true);//设置构造器的可访问性
		Object object = con.newInstance();
		//使用内省机制设置属性值
		BeanInfo beanInfo = Introspector.getBeanInfo(clzz, Object.class);
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor pd : pds) {
			//获取bean中所有属性名
			String propertyName = pd.getName();
			if("username".equals(propertyName)) {
				pd.getWriteMethod().invoke(object, "Agan");
			}
			if("age".equals(propertyName)) {
				pd.getWriteMethod().invoke(object, 18);
			}
		}
		world = (HelloWorld) object;
		//------------------------------------------------
		world.sayHello();
	}
}
