package com.NBdiMAN.dao.impl;

import org.springframework.stereotype.Repository;

import com.NBdiMAN.dao.IEmployeeDAO;
import com.NBdiMAN.domain.Employee;
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO{

	public void save(Employee emp) {
		System.out.println("保存员工");
	}

	public void update(Employee emp) {
		System.out.println("更新员工");
	}

}
