package com.sindhu.database.demodatabase.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sindhu.database.demodatabase.entity.Person;

@Repository
@Transactional
public class DemoDatabaseJpa {
	
	@PersistenceContext
	EntityManager entitymanager;
	
	public Person findByid(int id) {
		return entitymanager.find(Person.class, id);
		//return entitymanager.merge -- insert/update
		//return entitymanager.remove -- delete
				
	}
	/*
	 * public List<Person> findall(){
	 * 
	 * typedquery<person> namedquery entitymanager.createNamesQuery(find_all ,Person.class);
	 * return named.query.getlist();
	 * 
	 * 
	 * 
	 * }
	 */
	
	

}
