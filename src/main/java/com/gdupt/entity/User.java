package com.gdupt.entity;

import java.io.Serializable;

import lombok.Data;
@Data
public class User implements Serializable{
	private static final long serialVersionUID = 1452892231715822947L;
	private int id;
	private String name;
	private String password;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
}
