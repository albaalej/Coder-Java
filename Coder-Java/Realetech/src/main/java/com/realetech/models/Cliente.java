package com.realetech.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "Clientes")
public class Cliente {
	//declarar los campos
	@Id // PRIMARY KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
		
	@Column
	private String domicilio;
	
	@Column(unique = true, nullable = false)
	private int matricula;
	
	@Column(nullable = false)
	private String mail;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Venta> ventas;
	
	
	@OneToMany( 										
			mappedBy = "cliente",						
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
			) 
	
	private List<Venta> venta ;
	
}
