package com.SkillIndia.model;

public class BankDetails {

	private String bank_name, branch, IFSC;
	Address bank_add = new Address();
	public String getBank_name() {
		return bank_name;
	}
	@Override
	public String toString() {
		return "BankDetails [bank_name=" + bank_name + ", branch=" + branch + ", IFSC=" + IFSC + ", bank_add="
				+ bank_add + "]";
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public Address getBank_add() {
		return bank_add;
	}
	public void setBank_add(Address bank_add) {
		this.bank_add = bank_add;
	}
	
}
