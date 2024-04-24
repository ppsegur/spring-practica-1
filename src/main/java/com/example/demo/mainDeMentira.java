package com.example.demo;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.modelo.Alumno;
import com.example.modelo.Curso;
import com.example.repository.AlumnoRepository;
import com.example.repository.CursoRepository;

import jakarta.annotation.PostConstruct;

@Component
public class mainDeMentira {
	 
	@Autowired
	private AlumnoRepository repo;
	  @Autowired
	  private CursoRepository Crepo;
	  
	  
	
	@PostConstruct
	void ejecutar() {
		
		Curso c = new Curso("1 Dam", "Miguel Campos");
		Crepo.save(c);
		Alumno a = new Alumno("Luis Miguel","López Magaña", 25, c);
		
		//repo.save(new Alumno("Luis Miguel","López Magaña", 25, c));
		a.addToCurso(c);
		repo.save(a);
		repo.findAll().forEach(System.out::println);
		
	}

	
		/*//repo.findAll().forEach(a -> System.out.println(a))
		//repo.findAll().forEach(System.out::println);
		//repo.findAll().forEach (new Consumer<Alumno>());
	*/
}
