package com.NBdiMAN.ioc;

import org.springframework.stereotype.Component;

//XML配置：<bean id="myDataSource" class="com.NBdiMAN.ioc.MyDataSource"/>
//注解配置
@Component("xx")       //组件的意思，直接用这个注解代替XML配置,如果不写id值，就是类型名首字母小写：myDataSource
public class MyDataSource {
	
}
