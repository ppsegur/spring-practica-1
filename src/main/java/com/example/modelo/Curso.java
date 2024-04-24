package com.example.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
	@Id
	private Long ID;
	
	private String nombre;
	private String tutor;
	
	@OneToMany(mappedBy = "curso", fetch = FetchType.EAGER) //Lo que se pone dentro es el nombre en la clase de enfrente que tiene el atributo anotado con many to one en este caso curso
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<Alumno> alumnos = new ArrayList<>();
	
	public Curso(String nombre, String tutor) {
		super();
		this.nombre = nombre;
		this.tutor = tutor;
	}
	
	
}
