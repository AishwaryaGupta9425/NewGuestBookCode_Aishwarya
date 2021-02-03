package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class guestbook {
	@Id
	@GeneratedValue(generator="sequence", strategy=GenerationType.SEQUENCE)
	private int id;
	private String email;
	private String data;
	@Override
	public String toString() {
		return "guestbook [id=" + id + ", email=" + email + ", data=" + data + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
