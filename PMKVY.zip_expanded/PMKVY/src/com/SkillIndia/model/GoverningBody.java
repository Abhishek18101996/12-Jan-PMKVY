package com.SkillIndia.model;

public class GoverningBody {

	Establishment establishment = new Establishment();

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public GoverningBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoverningBody(Establishment establishment) {
		super();
		this.establishment = establishment;
	}
	
}
