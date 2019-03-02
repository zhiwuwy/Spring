package com.NBdiMAN.log;

import java.util.Date;

//在service方法调用之前，要做日志记录
public class LogUtil {
	public void writeLog(String className,String methodName) {
		System.out.println(new Date().toLocaleString() + "调用了" + className + "类中的" + methodName + "方法");
	}
}
