package com.SkillIndia.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class User {
	private String username;
	private String password;		//type to be determined later
	private String name,gender;
	Address add = new Address();
	BankDetails bd = new BankDetails();
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", gender=" + gender
				+ ", add=" + add + ", bd=" + bd +  "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public BankDetails getBd() {
		return bd;
	}
	public void setBd(BankDetails bd) {
		this.bd = bd;
	}

	
}
