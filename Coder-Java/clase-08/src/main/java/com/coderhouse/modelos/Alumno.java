package com.coderhouse.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;

public class Alumno {

	 @Id 
	 @GeneratedValue(strategy = GenererationType.IDENTITY)
		private Long id;
		private String nombre;
		private String apellido;
		
		@Column(unique = true, nulleable = false)
		private Long dni;
		
		@Column(unique = true, nulleable = false)
		private String legajo;
		
		@ManyToMany(fetch = FetchType.EAGER)
		@JoinTable(
				name = "curso_alumno",
				joinColumns = @JoinColumn(name = "curso_id"),
				inverseJoinColumns = @JoinColumn(name = "alumno_id")
				)
		
		private List<Curso> cursos = new ArrayList<>();
		
		
}		
