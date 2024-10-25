package com.realetech.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="idCliente")
	private Integer idCliente;
	
	@Column(name="idProducto")
	private Integer idProducto;
	
	@Column(name="precioVentaProducto")
	private Integer precioVentaProducto;
	
	@Column(name="fechaVenta")
	private String fechaVenta;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getPrecioVentaProducto() {
		return precioVentaProducto;
	}

	public void setPrecioVentaProducto(Integer precioVentaProducto) {
		this.precioVentaProducto = precioVentaProducto;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", idCliente=" + idCliente + ", idProducto=" + idProducto + ", precioVentaProducto="
				+ precioVentaProducto + ", fechaVenta=" + fechaVenta + "]";
	}
	
	
	
	
}
