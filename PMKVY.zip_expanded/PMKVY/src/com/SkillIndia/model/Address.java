package com.SkillIndia.model;

public class Address {

	private String house_no,street,city,district,state,country;
	private int pincode;
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(String house_no, String street, String city, String district, String state, String country,
			int pincode) {
		super();
		this.house_no = house_no;
		this.street = street;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [house_no=" + house_no + ", street=" + street + ", city=" + city + ", district=" + district
				+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
