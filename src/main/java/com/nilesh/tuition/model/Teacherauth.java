package com.nilesh.tuition.model;

public class Teacherauth {

	String loginid;
	String password;
	public Teacherauth(String loginid, String password) {
		super();
		this.loginid = loginid;
		this.password = password;
	}
	
	public Teacherauth() {}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
