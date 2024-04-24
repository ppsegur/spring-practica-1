package com.example.demo;

import org.springframework.stereotype.Component;

import com.example.repository.AlumnoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class mainDeMentira {
	  
	private AlumnoRepository repo;
	
	@PostConstruct
	void ejecutar() {
		
	}
}
