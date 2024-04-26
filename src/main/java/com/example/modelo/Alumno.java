package com.example.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="alumnado")
@Builder
//MainDeMentira
public class Alumno {

		@Id @GeneratedValue
		private Long Id;
		
		@Column(columnDefinition = "VARCHAR(100)")
		private String nombre;
		private String Apellido;
		private float edad;
		
		@ManyToOne
		@JoinColumn(foreignKey = @ForeignKey(name = "fk_alumno_curso"))
		private Curso curso;

		public Alumno(String nombre, String apellido, float edad, Curso curso) {
			super();
			this.nombre = nombre;
			Apellido = apellido;
			this.edad = edad;
			this.curso = curso;
		}
		
		//metodos helper
		public void addToCurso(Curso curso) {
			this.curso = curso;
			curso.getAlumnos().add(this);
		}
		
		public void removeFromCurso(Curso curso) {
			curso.getAlumnos().remove(this);
			this.curso = null;		
		}

}
