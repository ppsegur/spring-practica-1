package com.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
	@Id
	private Long ID;
	
	private String nombre;
	private String tutor;
	
	public Curso(String nombre, String tutor) {
		super();
		this.nombre = nombre;
		this.tutor = tutor;
	}
	
	
}
