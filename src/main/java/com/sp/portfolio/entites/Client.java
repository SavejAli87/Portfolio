package com.sp.portfolio.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table

public class Client {

	
	@Id
	@GeneratedValue
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String  email;
	
	@Column
	private String Messages;
	
	@Column
	private String Phone_No;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMessages() {
		return Messages;
	}
	public void setMessages(String messages) {
		Messages = messages;
	}
	public String getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(String phone_No) {
		Phone_No = phone_No;
	}
	
	
	
	
	
}
