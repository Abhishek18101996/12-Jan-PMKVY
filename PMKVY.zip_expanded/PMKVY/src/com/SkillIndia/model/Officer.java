package com.SkillIndia.model;

public class Officer extends User{

	Candidate candidate = new Candidate();
	User user = new User();
	public Candidate getCandidate() {
		return candidate;
	}
	public Officer(Candidate candidate, User user) {
		super();
		this.candidate = candidate;
		this.user = user;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
