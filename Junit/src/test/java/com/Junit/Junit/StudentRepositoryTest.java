package com.Junit.Junit;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Junit.Junit.Repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryTest {
	
	@Autowired
	StudentRepository studentrpoesitory;
	
	@Autowired
	EntityManager entitymanager;
	
	@Test
	public void findById() {
		
	}

}
