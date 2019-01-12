package com.SkillIndia.model;

public class Courses {

	private int courseId;
	private String CourseName;
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(int courseId, String courseName, Candidate candidate, Establishment establishment) {
		super();
		this.courseId = courseId;
		CourseName = courseName;
		this.candidate = candidate;
		this.establishment = establishment;
	}
	Candidate candidate = new Candidate();
	Establishment establishment = new Establishment();
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
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
}
