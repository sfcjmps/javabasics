package com.hcl.dept;

import java.util.Scanner;

import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeptInsertDao {
	private JdbcTemplate  jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertDept() {
		int deptno;
		String dname;
		String loc;
		String head;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department No : ");
		deptno = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Department Name : ");
		dname = sc.nextLine();
		System.out.println("Enter Location : ");
		loc = sc.nextLine();
		System.out.println("Enter Head : ");
		head = sc.nextLine();
		String cmd = "insert into department values(?,?,?,?)";
		jdbcTemplate.update(cmd,new Object[]{deptno,dname,loc,head});
		System.out.println("Department Inserted...");
	}
}
