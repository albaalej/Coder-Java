package com.realetech.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Venta_Detalle")
public class Venta_Detalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="idVentas")
	private Integer idVentas;
	
	@Column(name="idProducto")
	private Integer idProducto;
	
	@Column(name="cantidad")
	private Integer cantidad;

	@Column(name="precioVentaProducto")
	private Integer precioVentaProducto;
	
  	@ManyToOne
    @JoinColumn(name = "id_venta")
    private Venta venta;
	    
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

	//Getters y setters
	public long getId() {return id;	}

	public void setId(long id) {this.id = id;}

	public Integer getIdVentas() {return idVentas;	}

	public void setIdVentas(Integer idVentas) {this.idVentas = idVentas;}

	public Integer getIdProducto() {return idProducto;}

	public void setIdProducto(Integer idProducto) {this.idProducto = idProducto;}

	public Integer getCantidad() {return cantidad;}
	public void setCantidad(Integer cantidad) {this.cantidad = cantidad;}
	
	public Integer getPrecioVentaProducto() {return precioVentaProducto;}

	public void setPrecioVentaProducto(Integer precioVentaProducto) {this.precioVentaProducto = precioVentaProducto;}

	@Override
	public String toString() {
		return "Venta_Detalle [id=" + id + ", idVentas=" + idVentas + ", idProducto=" + idProducto
				+ ", precioVentaProducto=" + precioVentaProducto + "]";
	}


}
