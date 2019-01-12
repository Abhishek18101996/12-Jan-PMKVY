package com.SkillIndia.model;

import java.io.File;

public class Establishment{

	public Establishment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Establishment(User user, String establishmentType, int contact, int workingDaysPerWeek, File contract) {
		super();
		this.user = user;
		EstablishmentType = establishmentType;
		this.contact = contact;
		this.workingDaysPerWeek = workingDaysPerWeek;
		Contract = contract;
	}
	User user = new User();
	private String EstablishmentType;
	private int contact,workingDaysPerWeek;
	File Contract = new File(EstablishmentType);
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getEstablishmentType() {
		return EstablishmentType;
	}
	public void setEstablishmentType(String establishmentType) {
		EstablishmentType = establishmentType;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getWorkingDaysPerWeek() {
		return workingDaysPerWeek;
	}
	public void setWorkingDaysPerWeek(int workingDaysPerWeek) {
		this.workingDaysPerWeek = workingDaysPerWeek;
	}
	public File getContract() {
		return Contract;
	}
	public void setContract(File contract) {
		Contract = contract;
	}
}
