package com.realetech.models;

import java.util.ArrayList; 
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "Productos")
public class Producto {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//declaro columnas
	@Column
	private String nombre;
	
	@Column
	private String marca;
	
	@Column
	private Integer precio;
	
	@Column
	private String categoria;
	
	@Column
	private Integer stock;
	
	@ManyToOne												
	@JoinColumn(name = "VentaDetalle", nullable = false)		
	private VentaDetalle VentaDetalle;
}
