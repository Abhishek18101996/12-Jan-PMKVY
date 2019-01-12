package com.SkillIndia.model;

public class Admin extends User{

	User user = new User();
	Candidate candidate = new Candidate();
	Establishment establishment = new Establishment();
	Courses courses = new Courses();
	
	public Admin(User user, Candidate candidate, Establishment establishment, Courses courses) {
		super();
		this.user = user;
		this.candidate = candidate;
		this.establishment = establishment;
		this.courses = courses;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


}
