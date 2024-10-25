package com.coderhouse.modelos;


import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Curso {
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nombre;
		
		private List<Alumno> alumno = new ArrayList<>();
}
