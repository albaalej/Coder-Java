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
	
	//@Column
	//private Integer idVentas;
	
	//@Column
	//private Integer idProducto;
	
	@Column
	private Integer cantidad;

	@Column
	private Integer precioVentaProducto;
	
	  @ManyToOne
	    @JoinColumn(name = "venta_id")
	    private Venta venta;

	    @ManyToOne
	    @JoinColumn(name = "producto_id")
	    private Producto producto;
	
	//setters y getters

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "VentaDetalle [id=" + id + ", cantidad=" + cantidad + ", precioVentaProducto=" + precioVentaProducto
				+ ", producto=" + producto + "]";
	}


	public VentaDetalle(long id, Integer cantidad, Integer precioVentaProducto, Venta venta, Producto producto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.precioVentaProducto = precioVentaProducto;
		this.venta = venta;
		this.producto = producto;
	}


	public VentaDetalle() {
		super();
		// TODO Auto-generated constructor stub
	}
 




	
	
}
