package com.skillindia.model;

import java.util.Arrays;

public class Courses {

	//declarations
	private int courseId;//Id of particular course
	private String courseName;//Name of the course
	private String courseDomain;//The domain of the course
	Establishment establishmentName[];//The list of establishments providing the course
	
	//SuperClass Constructor
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public Courses(int courseId, String courseName, String courseDomain, Establishment[] establishmentName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDomain = courseDomain;
		this.establishmentName = establishmentName;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", courseDomain=" + courseDomain
				+ ", establishmentName=" + Arrays.toString(establishmentName) + "]";
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDomain() {
		return courseDomain;
	}

	public void setCourseDomain(String courseDomain) {
		this.courseDomain = courseDomain;
	}

	public Establishment[] getEstablishmentName() {
		return establishmentName;
	}

	public void setEstablishmentName(Establishment[] establishmentName) {
		this.establishmentName = establishmentName;
	}
	
}
