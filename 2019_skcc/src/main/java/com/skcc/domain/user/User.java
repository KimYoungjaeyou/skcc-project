package com.skcc.domain.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	String	mbr_id;
	
	String	email;
	
	String	hp;
	
	String	password;

	public String getMbr_id() {
		return mbr_id;
	}

	public void setMbr_id(String mbr_id) {
		this.mbr_id = mbr_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [mbr_id=" + mbr_id + ", email=" + email + ", hp=" + hp + ", password=" + password + "]";
	}


}
