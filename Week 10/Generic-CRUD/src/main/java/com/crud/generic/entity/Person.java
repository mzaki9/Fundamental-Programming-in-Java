package com.crud.generic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.BaseEntity;

@Entity
@Table(name = "person")
public class Person extends BaseEntity {

	@Column(name = "email", nullable = false, length = 200)
	private String email;

	@Column(name = "address", nullable = false, length = 200)
	private String address;

	@Column(name = "NIM", nullable = false, length = 200)
	private String nim;

	public Person() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNim() {
		return this.nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

}
