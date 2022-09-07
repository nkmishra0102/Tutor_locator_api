package com.nilesh.tuition.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Student {
	@Id
	String loginid;
	String password;
	String name;
	long phno;
	public Student() {}
	
	
	public Student(String loginid, String password, String name, long phno) {
		super();
		this.loginid = loginid;
		this.password = password;
		this.name = name;
		this.phno = phno;
	}


	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
