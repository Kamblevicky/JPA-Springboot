package com.Junit.Junit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VickyStudent {
	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String name;

	@OneToOne
	private VickyPassport passport;

	protected VickyStudent() {
	}

	public VickyStudent(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId(int id) {
		return id;
	}

	public VickyPassport getPassport() {
		return passport;
	}

	public void setPassport(VickyPassport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return String.format("VickyStudent [id=%s, name=%s, passport=%s]", id, name, passport);
	}

}
