package com.Junit.Junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.Junit.Junit.Repository.StudentRepository;



@SpringBootApplication
//@EntityScan(basePackages = {"com.Junit.JunitEntity"})
public class JunitApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentrepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JunitApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		// 1st method for Student
		studentrepository.saveStudentWithPassport();
		
		

	}
}