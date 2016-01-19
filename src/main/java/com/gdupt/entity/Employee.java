package com.gdupt.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 3599671510121360557L;
	private int id;
	private String userName;
	private String password;
	private Date createDate;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", userName=" + userName + ", password=" + password + ", createDate=" + createDate
				+ "]";
	}
	
	
}
