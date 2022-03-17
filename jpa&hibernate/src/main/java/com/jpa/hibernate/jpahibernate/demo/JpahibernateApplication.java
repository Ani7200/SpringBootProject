package com.jpa.hibernate.jpahibernate.demo;

//import javax.persistence.Id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpahibernateApplication implements CommandLineRunner {
	
	
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseRepository repository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(JpahibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		AniruddhaCourse course =repository.findById(1222);
		
	
		logger.info("{}",course);
		repository.deleteById(1555);
	/*	repository.deleteById(1111);*/
		
		
			
		}
		
		
	}


