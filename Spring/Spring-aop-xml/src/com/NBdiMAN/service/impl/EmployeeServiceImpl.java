package com.NBdiMAN.service.impl;

import com.NBdiMAN.dao.IEmployeeDAO;
import com.NBdiMAN.domain.Employee;
import com.NBdiMAN.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {
	
	private IEmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(IEmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	public void save(Employee emp) {
		employeeDAO.save(emp);
		System.out.println("保存成功");
	}

	public void update(Employee emp) {
		employeeDAO.update(emp);
		throw new RuntimeException("故意错误的");
	}

}
