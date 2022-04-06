package com.project.database.databaseDemo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.database.databaseDemoRepository.PersonJpaRepository;

@SpringBootApplication(scanBasePackages = { "com.project.database.databaseDemo","com.project.database.databaseDemoRepository" })
//@EntityScan(basePackages = {"com.project.database.databaseDemoRepository"})
public class JpaDemoApplication implements CommandLineRunner {

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		// logger.info("All users->{}",repository.findAll());
		System.out.println("all users :- {}" +repository.findAll());

		//System.out.println("User id 102 ->{}" + repository.findById(102));

		//repository.deleteById(104);

		// System.out.printf("Inserting 105 ->{}",repository.insert(new VivekPerson(104,
		// "Panakj Parghane", "Nanded", new Date())));

		// System.out.printf("Update 104->{}", repository.update(new
		// VivekPerson(104,"subodhkumar Solanke", "Pune", new Date())));
	}

}
