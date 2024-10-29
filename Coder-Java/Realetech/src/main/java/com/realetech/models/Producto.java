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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public VentaDetalle getVentaDetalle() {
		return VentaDetalle;
	}

	public void setVentaDetalle(VentaDetalle ventaDetalle) {
		VentaDetalle = ventaDetalle;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", categoria="
				+ categoria + ", stock=" + stock + ", VentaDetalle=" + VentaDetalle + "]";
	}
	
	
}
