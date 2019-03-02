package com.NBdiMAN.dao.impl;

import com.NBdiMAN.dao.IEmployeeDAO;
import com.NBdiMAN.domain.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO{

	public void save(Employee emp) {
		System.out.println("保存员工");
	}

	public void update(Employee emp) {
		System.out.println("更新员工");
	}

}
