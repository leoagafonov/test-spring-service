package com.example.testApplication;

import com.example.testApplication.dto.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonService extends JpaRepository<Person, Integer> {
}
