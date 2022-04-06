package com.Junit.Junit.Repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Junit.Junit.Entity.VickyPassport;
import com.Junit.Junit.Entity.VickyStudent;

@Repository
@Transactional
public class StudentRepository 
{
	
	
	@Autowired
	EntityManager entitymanager;
	
	public void saveStudentWithPassport() {
		
		VickyPassport passport=new VickyPassport("009988");
		entitymanager.persist(passport);
		
		VickyStudent student= new VickyStudent("Shyam");
		student.setPassport(passport);
		entitymanager.persist(student);
	}

}
