package com.NBdiMAN.proxy;

import com.NBdiMAN.domain.Employee;
import com.NBdiMAN.service.IEmployeeService;
import com.NBdiMAN.tx.TransactionManager;

//静态代理类
public class EmployeeServiceProxy implements IEmployeeService{
	
	private IEmployeeService target;//真实对象或称委托对象
	
	private TransactionManager txManager;
	
	public void setTarget(IEmployeeService target) {
		this.target = target;
	}
	
	public void setTxManager(TransactionManager txManager) {
		this.txManager = txManager;
	}
	
	public void save(Employee emp) {
		txManager.begin();//开启事务
		try {
			target.save(emp);
			txManager.commit();//操作成功，提交事务
		} catch (Exception e) {
			e.printStackTrace();
			txManager.rollback();//操作失败，回滚事务
		}
	}

	public void update(Employee emp) {
		txManager.begin();//开启事务
		try {
			target.update(emp);
			txManager.commit();//操作成功，提交事务
		} catch (Exception e) {
			e.printStackTrace();
			txManager.rollback();//操作失败，回滚事务
		}
	}
	
}
