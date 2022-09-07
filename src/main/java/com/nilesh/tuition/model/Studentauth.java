package com.nilesh.tuition.model;

public class Studentauth {

	String loginid;
	String password;
	public Studentauth() {}
	
	public Studentauth(String loginid, String password) {
		super();
		this.loginid = loginid;
		this.password = password;
	}
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
