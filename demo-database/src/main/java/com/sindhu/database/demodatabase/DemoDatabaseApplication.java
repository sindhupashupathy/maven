package com.sindhu.database.demodatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.sindhu.database.demodatabase.jdbc.PersonDemoJdbc;
import com.sindhu.database.demodatabase.jpa.DemoDatabaseJpa;
@SpringBootApplication
public class DemoDatabaseApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	DemoDatabaseJpa  demoDatabasejpa;
	//PersonDemoJdbc personDemoJdbc;
	//SpringDataJpa SpringDataJpa
	
	public static void main(String[] args) {
		SpringApplication.run(DemoDatabaseApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//logger.info("All user {} ", personDemoJdbc.findall());
		logger.info("All 10002-> {} ", demoDatabasejpa.findByid(10002));
		//logger.info("delete 10002-> {} ", personDemoJdbc.findbyid(10001));
		//logger.info("update 10004-> {} ", personDemoJdbc.insert(new Person(10004,sindhu,bangalore,new Date()));
		//logger.info("update 10004-> {} ", personDemoJdbc.update(new Person (usha));
		//logger.info("update 10004-> {} ", demoDatabasejpa.insert(new Person(10004,sindhu,bangalore,new Date()));
				//logger.info("update 10004-> {} ", demoDatabasejpa.update(new Person (usha));
		//demoDatabasejpa.findbyid(10001));
		
		//logger.info("update 10004-> {} ", personDemoJdbc.save(new Person(10004,sindhu,bangalore,new Date()));
		//logger.info("update 10004-> {} ", personDemoJdbc.save(new Person (usha)); //sprig data
	}
	
	

}
