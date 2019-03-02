package com.NBdiMAN.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NBdiMAN.dao.IEmployeeDAO;
import com.NBdiMAN.domain.Employee;
import com.NBdiMAN.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO employeeDAO;
	
	public void save(Employee emp) {
		employeeDAO.save(emp);
		System.out.println("保存成功");
	}

	public void update(Employee emp) {
		employeeDAO.update(emp);
		throw new RuntimeException("故意错误的");
	}

}
