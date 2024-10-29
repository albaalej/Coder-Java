package com.realetech.models;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "Ventas")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/*@Column
	private Integer id_Cliente;*/
	
	
	@Column
	private Integer precio_Venta_Total;
	
	@Column
	private String fecha_Venta;

	@ManyToOne												
	@JoinColumn(name = "cliente_id", nullable = false)		
	private Cliente cliente;


	
	
	
}
