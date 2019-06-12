package com.sindhu.database.demodatabase.jdbc;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sindhu.database.demodatabase.entity.Person;


@Repository
public class PersonDemoJdbc {
	
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	
	/*
	 * public List<Person> findall(){
	 * 
	 * return jdbctemplate.query("select * from person", new
	 * BeanPropertyRowMapper<Person>(Person.class));
	 * 
	 * 
	 * }
	 */
	 
	/*
	 * public int deletebyid(int id ) { return
	 * jdbctemplate.update("delete * from person where id=?",new
	 * Object[]{id},new BeanPropertyRowMapper<Person>(Person.class)); }
	 */
	/*
	 * public int insert(Person person) { return
	 * jdbctemplate.update("insert into person (id , name,location,birthdate)" +
	 * " values(?,?,?,?)",new Object[]
	 * {person.getId(),person.getName(),person.getLocation(),new Timestamp(person.getBirthDate().getdate()});
	 * ;
	 * 
	 * }
	 */
	/*
	 * public int update(Person person) { return
	 * jdbctemplate.update("update person"+"set name=?",new Object[]
	 * {person.getName()});
	 * ;
	 * 
	 * }
	 */
	  public Person findbyid(int id ) { return
	  jdbctemplate.queryForObject("select * from person where id=?",new
	  Object[]{id},new BeanPropertyRowMapper<Person>(Person.class)); }
	 
}
