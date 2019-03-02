package com.NBdiMAN.service.impl;

import com.NBdiMAN.dao.impl.EmployeeDAOImpl;
import com.NBdiMAN.domain.Employee;

public class EmployeeServiceImpl {
	
	private EmployeeDAOImpl employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAOImpl employeeDAO) {
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
