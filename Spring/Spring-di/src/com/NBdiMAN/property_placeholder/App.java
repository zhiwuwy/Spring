package com.NBdiMAN.property_placeholder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.alibaba.druid.pool.DruidDataSource;

import lombok.Cleanup;

@SpringJUnitConfig
public class App {
	@Autowired
	private DruidDataSource ds;
	@Test
	void test() throws Exception {
		
		@Cleanup
		Connection conn = ds.getConnection();
		
		@Cleanup
		PreparedStatement ps = conn.prepareStatement("select * from student");
		
		@Cleanup
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getLong("id")+",");
			System.out.print(rs.getString("name")+",");
			System.out.println(rs.getInt("age"));
		}
		
		
	}
}
