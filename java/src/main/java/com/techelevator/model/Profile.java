package com.techelevator.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Profile {
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private int feet;
	private int inches;
	private Date birthday;
	private BigDecimal weight;
	
	
	
	
	public Profile() {
		
	}
	
	
	
	public Profile(String firstName, String lastName, String email, int age, int feet, int inches, Date birthday,
			BigDecimal weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.feet = feet;
		this.inches = inches;
		this.birthday = birthday;
		this.weight = weight;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}