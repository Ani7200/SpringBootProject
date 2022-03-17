package com.jpa.hibernate.jpahibernate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jpa.hibernate.jpahibernate.demo.AniruddhaCourse;
import com.jpa.hibernate.jpahibernate.demo.CourseRepository;
import com.jpa.hibernate.jpahibernate.demo.JpahibernateApplication;



@SpringBootTest(classes=JpahibernateApplication.class)
class JpahibernateApplicationTests {
	
	
	
	
	@Autowired
	private CourseRepository repository;

	@Test
	public void contextLoads() {
		
		AniruddhaCourse course =repository.findById(1555);
		assertEquals("spring boot in 100 steps",course.getName());
		//AniruddhaCourse course =repository.findById(1555);
		
		
		
		
		
		
			
	}

}
