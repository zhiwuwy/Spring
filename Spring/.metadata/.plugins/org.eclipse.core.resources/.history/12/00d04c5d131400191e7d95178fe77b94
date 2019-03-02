package com.NBdiMAN.service.impl;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.test.context.transaction.BeforeTransaction;

import com.NBdiMAN.dao.IAccountDAO;
import com.NBdiMAN.service.IAccountService;

import lombok.Setter;

public class AccountServiceImpl implements IAccountService{
	
	@Setter
	private IAccountDAO accountDAO;
	
	public void trans(Long outId, Long inId, int money) {
		accountDAO.transOut(outId, money);
		//int a = 1 / 0;
		accountDAO.transIn(inId, money);
	}

}
