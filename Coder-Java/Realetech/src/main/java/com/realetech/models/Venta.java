package com.realetech.models;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "Ventas")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*@Column
	private Integer id_Cliente;*/
	
	
	@Column
	private Integer precio_Venta_Total;
	
	@Column
	private String fecha_Venta;

	@ManyToOne												
	@JoinColumn(name = "cliente_id", nullable = false)	
	@JsonIgnore
	private Cliente cliente;
	
	@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<VentaDetalle> detalles = new ArrayList<>();


	 //getters y setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getPrecio_Venta_Total() {
		return precio_Venta_Total;
	}

	public void setPrecio_Venta_Total(Integer precio_Venta_Total) {
		this.precio_Venta_Total = precio_Venta_Total;
	}

	public String getFecha_Venta() {
		return fecha_Venta;
	}

	public void setFecha_Venta(String fecha_Venta) {
		this.fecha_Venta = fecha_Venta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", precio_Venta_Total=" + precio_Venta_Total + ", fecha_Venta=" + fecha_Venta
				+ ", cliente=" + cliente + "]";
	}

	public Venta(long id, Integer precio_Venta_Total, String fecha_Venta, Cliente cliente,
			List<VentaDetalle> detalles) {
		super();
		this.id = id;
		this.precio_Venta_Total = precio_Venta_Total;
		this.fecha_Venta = fecha_Venta;
		this.cliente = cliente;
		this.detalles = detalles;
	}

	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
}
