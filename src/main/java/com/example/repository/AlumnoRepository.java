package com.example.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modelo.Alumno;

public  interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	
	}

