package com.realetech.objetos;

public class Clientes {

// Atributos 	
	private Integer id; 
	private String nombre;
	private String apellido;
	private Integer matricula;
	private String domicilio;
	private String mail;
	  
// Métodos 
	public void nuevoUsuario(){
		System.out.println("Se agregará el siguiente usuario:"
				+ nombre + " y con apellido: " + apellido  
				+ "con numero de dni: " + matricula 
				+ " Domicilio: "+domicilio+
				"y el correo electronico es: " + mail
				);
		
	}
	
	public void modificarUsuario(){
		System.out.println("modifica");
	}
	public void eliminarUsuario(){
		System.out.println("elimina");
	}

// Getters y setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
