package com.skillindia.model;

import java.util.Arrays;

//Institution can be any private organization like an engineering college.. 
public class Institution {

	private int instituteId; //Institution Id
	private String instituteName; //Name of the Institution
	private String typeOfInstitute; //what kind of institute either engineering or pharmacy
	private int studentPerBranch[]; //No. of students per branch stored in arrays
	private String branchName[];//list of branches as per the institution
	
	public Institution() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institution(int instituteId, String instituteName, String typeOfInstitute, int[] studentPerBranch,
			String[] branchName) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.typeOfInstitute = typeOfInstitute;
		this.studentPerBranch = studentPerBranch;
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Institution [instituteId=" + instituteId + ", instituteName=" + instituteName + ", typeOfInstitute="
				+ typeOfInstitute + ", studentPerBranch=" + Arrays.toString(studentPerBranch) + ", branchName="
				+ Arrays.toString(branchName) + "]";
	}

	public int getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getTypeOfInstitute() {
		return typeOfInstitute;
	}

	public void setTypeOfInstitute(String typeOfInstitute) {
		this.typeOfInstitute = typeOfInstitute;
	}

	public int[] getStudentPerBranch() {
		return studentPerBranch;
	}

	public void setStudentPerBranch(int[] studentPerBranch) {
		this.studentPerBranch = studentPerBranch;
	}

	public String[] getBranchName() {
		return branchName;
	}

	public void setBranchName(String[] branchName) {
		this.branchName = branchName;
	}
	
}