package com.project.database.databaseDemoRepository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.project.database.databaseDemo.VivekPerson;

@Repository
@Transactional
public class PersonJpaRepository {
	
	// connect to database
	@PersistenceContext
	EntityManager entityManager;
	
	public List<VivekPerson> findAll(){
		TypedQuery<VivekPerson>namedQuery=entityManager.createNamedQuery("find_all_vivek_person", VivekPerson.class);
		return namedQuery.getResultList();
	}

	
	public VivekPerson findById(int Id) { return
	  entityManager.find(VivekPerson.class, Id); }// JPA }

	public VivekPerson update(VivekPerson vivekperson) {
		return entityManager.merge(vivekperson);
	}

	public VivekPerson insert(VivekPerson vivekperson) {
		return entityManager.merge(vivekperson);
	}

	public void deleteById(int id) {
		VivekPerson vivekperson = findById(id);
		entityManager.remove(vivekperson);
	}
	

}
