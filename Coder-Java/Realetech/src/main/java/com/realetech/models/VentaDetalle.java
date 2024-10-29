package com.realetech.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ventas_Detalle")
public class VentaDetalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private Integer idVentas;
	
	@Column
	private Integer idProducto;
	
	@Column
	private Integer cantidad;

	@Column
	private Integer precioVentaProducto;
	
	@OneToMany(mappedBy = "VentaDetalle", cascade = CascadeType.ALL)
    private List<Producto> Productos;
	
	
	@OneToMany( 										
			mappedBy = "VentaDetalle",					
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
			) 
	
	private List<Producto> Producto ;
}
