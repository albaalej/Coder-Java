package com.realetech.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	

	@OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,fetch = FetchType.EAGER) 
	@JsonIgnore
	private List<Venta> venta ;


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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Venta> getVenta() {
		return venta;
	}


	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio
				+ ", matricula=" + matricula + ", mail=" + mail + "]";
	}


	public Cliente(Long id, String nombre, String apellido, String domicilio, int matricula, String mail) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.matricula = matricula;
		this.mail = mail;
	}


	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}
