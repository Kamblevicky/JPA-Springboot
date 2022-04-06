/*
 * package com.project.database.databaseDemo;
 * 
 * import java.sql.Date;
 * 
 * import org.slf4j.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication;
 * 
 * import ch.qos.logback.classic.Logger;
 * 
 * @SpringBootApplication public class DatabaseDemoApplication implements
 * CommandLineRunner{
 * 
 * private Logger logger=(Logger)LoggerFactory.getLogger(this.getClass());
 * 
 * @Autowired PersonJdbcDao dao;
 * 
 * public static void
 * main(String[]args){SpringApplication.run(DatabaseDemoApplication.class,args);
 * }
 * 
 * @Override public void run(String...args)throws Exception{ //
 * logger.info("All users->{}",dao.findAll());
 * 
 * System.out.println("all users :- {}" + dao.findAll());
 * 
 * // System.out.println("User id 102 ->{}" + dao.findById(102));
 * 
 * // System.out.println("Deleting id 103 ->{}"+ dao.deleteById(103));
 * 
 * // System.out.printf("Inserting 104 ->{}", dao.insert(new
 * VivekPerson(104,"subodh","Pune",new Date())));
 * 
 * // System.out.printf("Update 104->{}", dao.update(new
 * VivekPerson(104,"Subodhkumar Solanke","Hadgaon",new Date(0))));}
 * 
 * } }
 */