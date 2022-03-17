package com.jpa.hibernate.jpahibernate.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class AniruddhaCourse {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;


	
	public AniruddhaCourse() {
		
	}
	public AniruddhaCourse(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}
	@Override
	public String toString() {
		return String.format("AniruddhaCourse [name=%s]", name);
	}
	
	
	
	

}
