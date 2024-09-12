package com.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Alumno {

		@Id @GeneratedValue
		private Long Id;
		
		private String nombre;
		private String descripcion;
		private float pvp;
		
		public Alumno(String nombre, String descripcion, float pvp) {
			super();
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.pvp = pvp;
		}

}
