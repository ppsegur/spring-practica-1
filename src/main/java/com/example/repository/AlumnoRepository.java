package com.example.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.modelo.Alumno;
@Repository
public  interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	
	}

