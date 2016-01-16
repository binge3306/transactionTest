package com.gdupt.entity;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 3599671510121360557L;
	private int id;
	private String userName;
	private String password;
	private Date createDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", userName=" + userName + ", password=" + password + ", createDate=" + createDate
				+ "]";
	}
	
	
}
