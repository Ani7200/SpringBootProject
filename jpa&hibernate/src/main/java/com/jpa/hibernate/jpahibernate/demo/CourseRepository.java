package com.jpa.hibernate.jpahibernate.demo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	 
	EntityManager em;
	
	public AniruddhaCourse findById(long id) {
		return em.find(AniruddhaCourse.class,id);
	}

	public void deleteById(int i) {
		
		AniruddhaCourse course =findById(1222);
		em.remove(course);
		
		
	}
	public AniruddhaCourse save(AniruddhaCourse course) {
		
		if(course.getId() <0) {
			
			em.persist(course);
			
		}else {
			 
			em.merge(course);
			
		}
		
		return course;
		
		
	}
	

	
	
	
}
