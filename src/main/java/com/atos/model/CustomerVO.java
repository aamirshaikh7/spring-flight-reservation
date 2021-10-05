package com.atos.model;

import java.time.LocalDate;

public class CustomerVO {
	private int customerId; 
	private String title;
	private String firstName;
	private String surname;
	private LocalDate intDoB;
	private String mobile;
	private String email;
	
	public CustomerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerVO(int customerId, String title, String firstName, String surname, LocalDate intDoB, String mobile,
			String email) {
		super();
		this.customerId = customerId;
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		this.intDoB = intDoB;
		this.mobile = mobile;
		this.email = email;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public LocalDate getIntDoB() {
		return intDoB;
	}
	
	public void setIntDoB(LocalDate intDoB) {
		this.intDoB = intDoB;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "CustomerVO [customerId=" + customerId + ", title=" + title + ", firstName=" + firstName + ", surname="
				+ surname + ", intDoB=" + intDoB + ", mobile=" + mobile + ", email=" + email + "]";
	}
}
