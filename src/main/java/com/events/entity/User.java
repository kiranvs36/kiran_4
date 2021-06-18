package com.events.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Column(name="USER_ID", nullable=false)
	private String userId;	
	@Column(name="PASSWORD", nullable=false)
	private String password;
	@Column(name="USER_NAME", nullable=false)
	private String name;
	@Column(name="EMAIL_ID", nullable=false)
	private String email;
	@Column(name="PHONE_NUMBER")
	private long phone;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="CREATION_DATE")
	private Date creationDate = new Date();
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
}
