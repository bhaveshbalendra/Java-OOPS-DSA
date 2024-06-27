package com.encapsulation;

import java.util.Scanner;

public class Bank {
	private int account_number;
	String name;
	int mobile_number;
	private String login_password_Emp;
	static long  contact_number = 982121203;
	private int password = 123;
	
	Scanner sc = new Scanner(System.in);
	int enter = sc.nextInt();
	public Bank(String name, int mobile_number) {
		super();
		this.name = name;
		this.mobile_number = mobile_number;
	}
	
	
	public void setAccount_Number(int account_number) {
//		System.out.print("Please Enter the password ");
//		int enter = sc.nextInt();
		if (account_number > 0 ) this.account_number = account_number;
		else throw new IllegalArgumentException("wrong passoword");
	}
	
	public int getAccount_Number() {
//		System.out.print("Please Enter the Password ");
//		int enter = sc.nextInt();
		if (enter == password ) return this.account_number;
		else throw new IllegalArgumentException("wrong passoword");
		
	}

	public String getLogin_password_Emp() {
		return login_password_Emp;
	}

	public void setLogin_password_Emp(String login_password_Emp) {
		this.login_password_Emp = login_password_Emp;
	}
	
}
