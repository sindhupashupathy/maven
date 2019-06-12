package com.sindhu.database.demodatabase.springdata;
import com.sindhu.database.demodatabase.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpa extends JpaRepository<Person, Integer> {

}
