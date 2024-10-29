package com.realetech.models;

import java.util.ArrayList;
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
	
	@Column(name="idCliente")
	private Integer idCliente;
	
	
	@Column(name="precioVentaTotal")
	private Integer precioVentaTotal;
	
	@Column(name="fechaVenta")
	private String fechaVenta;

	@ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
	
	 @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
	 private List<Venta_Detalle> detalles = new ArrayList<>();
	
	//Getters y setters
	public long getId() {return id;}

	public void setId(long id) {this.id = id;}

	public Integer getIdCliente() {return idCliente;}

	public void setIdCliente(Integer idCliente) {this.idCliente = idCliente;}

	public Integer getPrecioVentaTotal() {return precioVentaTotal;}

	public void setPrecioVentaTotal(Integer precioVentaTotal) {this.precioVentaTotal = precioVentaTotal;}

	public String getFechaVenta() {return fechaVenta;}

	public void setFechaVenta(String fechaVenta) {this.fechaVenta = fechaVenta;}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", idCliente=" + idCliente + ", idProducto=" + ", precioVentaTotal="
				 + ", fechaVenta=" + fechaVenta + "]";
	}
	
	
	
	
}
