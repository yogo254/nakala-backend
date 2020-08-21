package com.yogo.nakalabackend.repo;

import com.yogo.nakalabackend.domain.Person;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PersonRepo
 */
public interface PersonRepo extends JpaRepository<Person, String> {

    Person findOneByEmail(String email);

}