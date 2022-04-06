package com.Junit.Junit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VickyPassport {

	@Id
	@GeneratedValue
	private int id;

	@Column
	private String number;
	@OneToOne(mappedBy = "passport")
	private VickyStudent student;

	public VickyPassport() {

	}

	public VickyPassport(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("VickyPassport [id=%s, number=%s]", id, number);
	}

}
