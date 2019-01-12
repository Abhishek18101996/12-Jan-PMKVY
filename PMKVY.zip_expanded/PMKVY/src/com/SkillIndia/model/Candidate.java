package com.SkillIndia.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Candidate extends User {

	private int progress;
	private int Aadhaar;
	private String EducationalDetails;
	private String username;
	private String password;		//type to be determined later
	private String name,gender;
	Address add = new Address();
	BankDetails bd = new BankDetails();
	FileInputStream fis = new FileInputStream("some path of the file");
	FileOutputStream doc = new FileOutputStream(fis);
	
	User user = new User();
	
	public Candidate(int progress, int aadhaar, String educationalDetails, String username, String password,
			String name, String gender, Address add, BankDetails bd, FileInputStream fis, FileOutputStream doc) {
		super();
		this.progress = progress;
		Aadhaar = aadhaar;
		EducationalDetails = educationalDetails;
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.add = add;
		this.bd = bd;
		this.fis = fis;
		this.doc = doc;
	}

	public Candidate(int aadhaar, String educationalDetails, String username, String password, String name,
			String gender, Address add, BankDetails bd, FileInputStream fis) {
		super();
		Aadhaar = aadhaar;
		EducationalDetails = educationalDetails;
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.add = add;
		this.bd = bd;
		this.fis = fis;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public int getAadhaar() {
		return Aadhaar;
	}

	public void setAadhaar(int aadhaar) {
		Aadhaar = aadhaar;
	}

	public String getEducationalDetails() {
		return EducationalDetails;
	}

	public void setEducationalDetails(String educationalDetails) {
		EducationalDetails = educationalDetails;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}

	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		super.setUsername(username);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return super.getGender();
	}

	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		super.setGender(gender);
	}

	@Override
	public Address getAdd() {
		// TODO Auto-generated method stub
		return super.getAdd();
	}

	@Override
	public void setAdd(Address add) {
		// TODO Auto-generated method stub
		super.setAdd(add);
	}

	@Override
	public BankDetails getBd() {
		// TODO Auto-generated method stub
		return super.getBd();
	}

	@Override
	public void setBd(BankDetails bd) {
		// TODO Auto-generated method stub
		super.setBd(bd);
	}

	@Override
	public FileInputStream getFis() {
		// TODO Auto-generated method stub
		return super.getFis();
	}

	@Override
	public void setFis(FileInputStream fis) {
		// TODO Auto-generated method stub
		super.setFis(fis);
	}

	@Override
	public FileOutputStream getDoc() {
		// TODO Auto-generated method stub
		return super.getDoc();
	}

	@Override
	public void setDoc(FileOutputStream doc) {
		// TODO Auto-generated method stub
		super.setDoc(doc);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
