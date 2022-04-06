package com.project.database.databaseDemo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "vivek_person")
@NamedQuery(name="find_all_vivek_person",query="select vp from VivekPerson vp")
public class VivekPerson {
	@Id
	@GeneratedValue
	private int id;

	@Column
	private String name;
	@Column
	private String location;
	@Column
	private Date birthDate;

	public VivekPerson() {

	}

	public VivekPerson(int id,String name, String location, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;

	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	
	@Override
	public String toString() {
		return String.format("VivekPerson \n[id=%d, name=%s, location=%s, birthDate=%s]", id, name, location,
				birthDate);
	}

}
