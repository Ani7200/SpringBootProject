package com.jpa.hibernate.jpahibernate;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.jpa.hibernate.jpahibernate.demo.CourseRepository;
import com.jpa.hibernate.jpahibernate.demo.JpahibernateApplication;

@SpringBootTest(classes=JpahibernateApplication.class)
class CourseRepositoryTest {

	@Test
	void contextLoads() {
	}
	

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseRepository repository;
	
@Test	


public void deleteById_basic() {
	
	repository.deleteById(1222);
	assertNull(repository.findById(1222));
	
	
}
}