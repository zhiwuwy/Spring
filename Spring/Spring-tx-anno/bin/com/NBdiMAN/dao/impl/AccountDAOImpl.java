// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   AccountDAOImpl.java

package com.NBdiMAN.dao.impl;

import com.NBdiMAN.dao.IAccountDAO;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDAOImpl
	implements IAccountDAO
{

	private JdbcTemplate jdbcTemplate;

	public AccountDAOImpl()
	{
	}

	public void setDataSource(DataSource ds)
	{
		jdbcTemplate = new JdbcTemplate(ds);
	}

	public void transOut(Long outId, int money)
	{
		jdbcTemplate.update("UPDATE account SET balance = balance - ? WHERE id = ?", new Object[] {
			Integer.valueOf(money), outId
		});
	}

	public void transIn(Long inId, int money)
	{
		jdbcTemplate.update("UPDATE account SET balance = balance + ? WHERE id = ?", new Object[] {
			Integer.valueOf(money), inId
		});
	}
}
