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


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Integer getIdVentas() {
		return idVentas;
	}


	public void setIdVentas(Integer idVentas) {
		this.idVentas = idVentas;
	}


	public Integer getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	public Integer getPrecioVentaProducto() {
		return precioVentaProducto;
	}


	public void setPrecioVentaProducto(Integer precioVentaProducto) {
		this.precioVentaProducto = precioVentaProducto;
	}


	public List<Producto> getProductos() {
		return Productos;
	}


	public void setProductos(List<Producto> productos) {
		Productos = productos;
	}


	public List<Producto> getProducto() {
		return Producto;
	}


	public void setProducto(List<Producto> producto) {
		Producto = producto;
	}


	@Override
	public String toString() {
		return "VentaDetalle [id=" + id + ", idVentas=" + idVentas + ", idProducto=" + idProducto + ", cantidad="
				+ cantidad + ", precioVentaProducto=" + precioVentaProducto + ", Productos=" + Productos + ", Producto="
				+ Producto + "]";
	}
	
	
}
