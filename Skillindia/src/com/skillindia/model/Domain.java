package com.skillindia.model;

public class Domain {

	//Declarations
	private int domainId;//Primary Key reference for a particular domain
	private String domainName;//Domain-Name
	
	//SuperClass Constructor
	public Domain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Domain(String domainName) {
		super();
		this.domainName = domainName;
	}
	
	
	
}