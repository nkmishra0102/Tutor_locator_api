package com.nilesh.tuition.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	String loginid;
	String password;
	String name;
	String locality;
	int minclass;
	int maxclass;
	String language;
	int upvotes;
	long phno;
	String address;
	String description;
	
   public Teacher(String loginid, String password, String name, String locality, int minclass, int maxclass,
			String language, int upvotes, long phno, String address, String description) {
		super();
		this.loginid = loginid;
		this.password = password;
		this.name = name;
		this.locality = locality;
		this.minclass = minclass;
		this.maxclass = maxclass;
		this.language = language;
		this.upvotes = upvotes;
		this.phno = phno;
		this.address = address;
		this.description = description;
	}

public Teacher() {}

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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public int getMinclass() {
	return minclass;
}
public void setMinclass(int minclass) {
	this.minclass = minclass;
}
public int getMaxclass() {
	return maxclass;
}
public void setMaxclass(int maxclass) {
	this.maxclass = maxclass;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public int getUpvotes() {
	return upvotes;
}
public void setUpvotes(int upvotes) {
	this.upvotes = upvotes;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

   
}
