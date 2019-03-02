package com.NBdiMAN.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.NBdiMAN.dao.IAccountDAO;
import com.NBdiMAN.service.IAccountService;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService{
	
	@Autowired
	private IAccountDAO accountDAO;
	
	public void trans(Long outId, Long inId, int money) {
		accountDAO.transOut(outId, money);
		int a = 1 / 0;
		accountDAO.transIn(inId, money);
	}

}
