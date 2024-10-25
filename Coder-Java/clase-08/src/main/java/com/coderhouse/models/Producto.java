package com.coderhouse.models;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    private int idProducto;
    private String nombre;
    private String marca;
    private double precio;
    private String categoria;
    private int stock;

    // Constructor
    public Producto(int idProducto, String nombre, String marca, double precio, String categoria, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    // Método para agregar un nuevo producto
    public static void nuevoProducto(Producto nuevo) {
        listaProductos.add(nuevo);
        System.out.println("Producto " + nuevo.nombre + " agregado con éxito.");
    }

    // Método para modificar un producto existente
    public static void modificarProducto(int idProducto, String nuevoNombre, double nuevoPrecio, int nuevoStock) {
        for (Producto producto : listaProductos) {
            if (producto.idProducto == idProducto) {
                producto.nombre = nuevoNombre;
                producto.precio = nuevoPrecio;
                producto.stock = nuevoStock;
                System.out.println("Producto con ID " + idProducto + " modificado con éxito.");
                return;
            }
        }
        System.out.println("Producto con ID " + idProducto + " no encontrado.");
    }

    // Método para dar de baja un producto
    public static void bajaProducto(int idProducto) {
        listaProductos.removeIf(producto -> producto.idProducto == idProducto);
        System.out.println("Producto con ID " + idProducto + " eliminado.");
    }

    // Getters y Setters
    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }
    // Otros getters y setters...

	public double getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
}
